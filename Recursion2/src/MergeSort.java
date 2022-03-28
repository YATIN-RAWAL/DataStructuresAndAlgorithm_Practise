import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	private static void mergeSort(int[] inputArray) {
		if(inputArray.length==1)
			return;
		mergeSort(inputArray,0,inputArray.length-1);
	}
	
	private static void mergeSort(int[] inputArray,int startIndex,int lastIndex) {
		if(startIndex>=lastIndex)
			return;
		int mid=startIndex+((lastIndex-startIndex)/2);
		mergeSort(inputArray,startIndex,mid);
		mergeSort(inputArray,mid+1,lastIndex);
		merge(inputArray,startIndex,mid,lastIndex);
	}

	
	
	
	private static void merge(int[] input,int startIndex,int mid,int lastIndex) {
		int[] sortedArray=new int[lastIndex-startIndex+1];
		int startIndex_first=startIndex;
		int startIndex_second=mid+1;
		int startIndex_sorted=0;
		while(startIndex<=mid &&startIndex_second<=lastIndex) {
			if(input[startIndex]<=input[startIndex_second]) {
				sortedArray[startIndex_sorted]=input[startIndex];
				startIndex++;
			}else {
				sortedArray[startIndex_sorted]=input[startIndex_second];
				startIndex_second++;
			}
			startIndex_sorted++;
		}
		
		
		while(startIndex<=mid) {
			sortedArray[startIndex_sorted]=input[startIndex];
			startIndex++;
			startIndex_sorted++;
		}
		while(startIndex_second<=lastIndex) {
			sortedArray[startIndex_sorted]=input[startIndex_second];
			startIndex_second++;
			startIndex_sorted++;
		}
		
		copyArray(input,sortedArray,startIndex_first);
	}
	
	
	private static void copyArray(int[] input, int[] sortedArray,int startIndex) {
		for(int i:sortedArray) {
			input[startIndex]=i;
			startIndex++;
					
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
		mergeSort(intArray);
		System.out.println(Arrays.toString(intArray));

	}
}
