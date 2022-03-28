import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	private static void quickSort(int[] input) {
		if (input.length == 1)
			return;
		quickSort(input, 0, input.length - 1);
	}

	private static void quickSort(int[] input, int startIndex, int endIndex) {
		if(startIndex>=endIndex)
			return;
		int pivot = input[startIndex];
		int pivotPos = findPivotPos(input, pivot, startIndex, endIndex);
		swapPivotToPivotPos(input, pivot, pivotPos, startIndex);
		moveSmallLargeElements(input, startIndex, endIndex, pivotPos);
		quickSort(input, startIndex, pivotPos-1);
		quickSort(input, pivotPos+1, endIndex);
	}

	private static int findPivotPos(int[] input, int pivot, int startIndex, int endIndex) {
		int count = 0;
		for (int i = startIndex + 1; i <= endIndex; i++) {
			if (pivot >= input[i]) {
				count += 1;
			}
		}
		return startIndex + count;
	}

	private static void swapPivotToPivotPos(int[] input, int pivot, int pivotPos, int startIndex) {
		int temp = pivot;
		input[startIndex] = input[pivotPos];
		input[pivotPos] = pivot;
	}

	private static void moveSmallLargeElements(int[] input, int startIndex, int endIndex, int pivotPos) {
		while (startIndex < pivotPos && endIndex > pivotPos) {
			if (input[startIndex] > input[pivotPos]) {
				if (input[endIndex] <= input[pivotPos]) {
					int temp = input[startIndex];
					input[startIndex] = input[endIndex];
					input[endIndex] = temp;
					startIndex++;
					endIndex--;
				} else {
					endIndex--;
				}
			} else if (input[endIndex] <= input[pivotPos]) {
				if (input[startIndex] > input[pivotPos]) {
					int temp = input[startIndex];
					input[startIndex] = input[endIndex];
					input[endIndex] = temp;
					startIndex++;
					endIndex--;
				} else {
					startIndex++;
				}
			}else {
				startIndex++;
				endIndex--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		String[] stringArray = inputString.split(" ");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		quickSort(intArray);
		System.out.println(Arrays.toString(intArray));

	}
}
