import java.util.Scanner;

public class FirstIndexOfANumber {
	
	
	
	
	/*
	 * Given an array of length N and an integer x, you need to find and return the
	 * first index of integer x present in the array. Return -1 if it is not present
	 * in the array. First index means, the index of first occurrence of x in the
	 * input array. Do this recursively. Indexing in the array starts from 0.
	 */
	
	
		
	private static int firstIndex(int[] input, int x) {
		if(input.length==0) {
			System.out.println("Not Found");
			return -1;
		}
		
		return firstIndex(input,x,0);
	}
	
	
	
	
	private static int firstIndex(int[] input,int x, int i) {
		if(input.length<=i) {
			return -1;
		}
		if(input[i]==x)
			return i;
		
		return firstIndex(input, x, i+1);
		
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Array");
		String inputString=input.nextLine();
		String[] stringArray=inputString.split(" ");
		int[] intArray=new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++) {
			intArray[i]=Integer.valueOf(stringArray[i]);
		}
		
		System.out.println("enter element whose firstIndex is to be found");
		int x=input.nextInt();
		System.out.println(firstIndex(intArray,x));
	
	}
	
	
	
}
