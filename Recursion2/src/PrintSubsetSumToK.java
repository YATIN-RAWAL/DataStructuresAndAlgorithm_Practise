import java.util.Scanner;

public class PrintSubsetSumToK {
	/*
	 * Given an array A and an integer K, print all subsets of A which sum to K.
	 * Subsets are of length varying from 0 to n, that contain elements of the
	 * array. But the order of elements should remain same as in the input array.
	 * Note : The order of subsets are not important. Just print them in different
	 * lines. Input format :
	 */

	private static void printSubsetsSumToK(int[] input, int k) {
		printSubsetsSumTOK(input, k, 0, "");
	}

	private static void printSubsetsSumTOK(int[] input, int k, int index, String output) {
		if (index >= input.length)
			return;
		if (input[index] == k) {
			System.out.println(output + k);
			printSubsetsSumTOK(input, k, index+1, output);
		}
		else if (input[index] < k) {
			printSubsetsSumTOK(input, k - input[index], index + 1, output + input[index] + " ");
			printSubsetsSumTOK(input, k, index + 1, output);
		}else
		printSubsetsSumTOK(input, k, index + 1, output);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		String[] stringArray = inputString.split(" ");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		System.out.println("Enter sum");
		int sum = input.nextInt();
		printSubsetsSumToK(intArray, sum);
	}

}
