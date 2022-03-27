import java.util.Scanner;

public class LastIndexOfInteger {
	
	
	
	/*
	 * Given an array of length N and an integer x, you need to find and return the
	 * last index of integer x present in the array. Return -1 if it is not present
	 * in the array. Last index means - if x is present multiple times in the array,
	 * return the index at which x comes last in the array. You should start
	 * traversing your array from 0, not from (N - 1). Do this recursively. Indexing
	 * in the array starts from 0.
	 */

	
	private static int lastIndex(int[] input, int x) {
		if (input.length == 0)
			return -1;
		return lastIndex(input, x, input.length - 1);
	}

	private static int lastIndex(int[] input, int x, int i) {
		if(i<0)
			return -1;
		if(x==input[i])
			return i;
		return lastIndex(input, x, i-1);
	}
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter array");
		String inputString=input.nextLine();
		String[] stringArray=inputString.split(" ");
		int[] intArray=new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++) {
			intArray[i]=Integer.valueOf(stringArray[i]);
		}
		
		
		System.out.println("Find :");
		int x=input.nextInt();
		System.out.println(lastIndex(intArray, x));
		
	}
	
}
