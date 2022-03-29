import java.util.Arrays;
import java.util.Scanner;

public class ReturnSubsetSumTOK {

	/*
	 * Given an array A of size n and an integer K, return all subsets of A which
	 * sum to K. Subsets are of length varying from 0 to n, that contain elements of
	 * the array. But the order of elements should remain same as in the input
	 * array. Note : The order of subsets are not important. Input format :
	 */

	private static int[][] subsetsSumK(int[] input, int sum) {
		return subsetsSumK(input, sum, 0);
	}

	private static int[][] subsetsSumK(int[] input, int sum, int index) {
		int[][] output = null;
		if (index >= input.length)
			return new int[0][0];
		int valueAtCurrentIndex = input[index];
		if (valueAtCurrentIndex > sum)
			return subsetsSumK(input, sum, index + 1);
		if (valueAtCurrentIndex == sum) {
			int[][] remainingSubset = subsetsSumK(input, sum, index + 1);
			if (remainingSubset.length == 0)
				return new int[][] { { valueAtCurrentIndex } };
			output = new int[remainingSubset.length + 1][];
			output[0] = new int[] { valueAtCurrentIndex };
			for (int i = 0; i < remainingSubset.length; i++) {
				output[i + 1] = remainingSubset[i];
			}
		} else {
			int[][] subsetsForRemainingK = subsetsSumK(input, sum - valueAtCurrentIndex, index + 1);
			int[][] subsetsForKWithoutThisIndex=subsetsSumK(input, sum,index+1);
			if (subsetsForRemainingK.length == 0)
				return subsetsForKWithoutThisIndex;
			
			output = new int[subsetsForRemainingK.length+subsetsForKWithoutThisIndex.length][];
			int i=0;
			for (i = 0; i < subsetsForRemainingK.length; i++) {
				output[i] = new int[subsetsForRemainingK[i].length+1];
				output[i][0] = valueAtCurrentIndex;
				for (int j = 0; j < subsetsForRemainingK[i].length; j++)
					output[i][j + 1] = subsetsForRemainingK[i][j];
			}
			int index2=0;
			while(index2<subsetsForKWithoutThisIndex.length) {
				output[i]=subsetsForKWithoutThisIndex[index2];
				index2++;
				i++;
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
		System.out.println("Enter Sum");
		int sum = input.nextInt();
		System.out.println(Arrays.deepToString(subsetsSumK(intArray, sum)));
	}
}
