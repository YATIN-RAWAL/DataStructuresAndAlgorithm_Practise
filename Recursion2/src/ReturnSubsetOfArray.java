import java.util.Arrays;
import java.util.Scanner;

public class ReturnSubsetOfArray {

	/*
	 * Given an integer array (of length n), find and return all the subsets of
	 * input array. Subsets are of length varying from 0 to n, that contain elements
	 * of the array. But the order of elements should remain same as in the input
	 * array. Note : The order of subsets are not important. Input format :
	 * 
	 * Line 1 : Size of array
	 * 
	 * Line 2 : Array elements (separated by space)
	 */

	private static int[][] returnSubset(int[] input) {
		return returnSubset(input, 0);
	}

	private static int[][] returnSubset(int[] input, int si) {
		if (si == input.length - 1)
			return new int[][] { {}, { input[si] } };

		int numberAtCurrentIndex = input[si];
		int[][] susbsetFromRemainingIndex = returnSubset(input, si + 1);
		int[][] output = new int[susbsetFromRemainingIndex.length*2][];
		for (int i = 0; i < susbsetFromRemainingIndex.length; i++) {
			output[i] = susbsetFromRemainingIndex[i];
			output[i + susbsetFromRemainingIndex.length] = new int[susbsetFromRemainingIndex[i].length + 1];
			output[i + susbsetFromRemainingIndex.length][0] = numberAtCurrentIndex;
			for (int j = 1; j <=susbsetFromRemainingIndex[i].length; j++) {
				output[i + susbsetFromRemainingIndex.length][j] = susbsetFromRemainingIndex[i][j - 1];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		String[] stringArray = inputString.split(" ");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		System.out.println(Arrays.deepToString(returnSubset(intArray)));

	}

}
