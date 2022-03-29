import java.util.Scanner;

public class BinarySearch {

	private static int  binarySearch(int[] input, int search) {
		return binarySearch(input, search, 0, input.length - 1);
	}

	private static int binarySearch(int[] input, int search, int si, int ei) {
		if (si > ei)
			return -1;
		int mid = si + ((ei - si) / 2);
		if (search == input[mid])
			return mid;
		else if (search > input[mid])
			return binarySearch(input, search, mid + 1, ei);
		return binarySearch(input, search, si, mid - 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array");
		String inputString = input.nextLine();
		String[] stringArray = inputString.split(" ");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		System.out.println("Enter element to be searched");
		int search = input.nextInt();
		System.out.println(binarySearch(intArray, search));

	}
}
