import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
 * Do this recursively. Indexing in the array starts from 0.*/
public class AllIndicesOfANumber {

	private static ArrayList<Integer> allIndices = new ArrayList<Integer>();

	private static int[] allIndices(int[] input, int x) {
		if (input.length == 0)
			return new int[0];
		ArrayList<Integer> output = allIndices(input, x, 0);
		int[] outputArray = new int[output.size()];
		for (int i = 0; i < outputArray.length; i++) {
			outputArray[i] = output.get(i);
		}

		return outputArray;
	}

	private static ArrayList<Integer> allIndices(int[] input, int x, int i) {
		if (i == input.length)
			return allIndices;
		if (input[i] == x)
			allIndices.add(i);
		return allIndices(input, x, i + 1);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array");
		String inputString = input.nextLine();
		String[] stringArray = inputString.split(" ");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		System.out.println("Find: ");
		int x = input.nextInt();

		System.out.println(Arrays.toString(allIndices(intArray, x)));
	}
}
