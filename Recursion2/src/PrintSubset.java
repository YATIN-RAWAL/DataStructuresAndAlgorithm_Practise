import java.util.Scanner;

public class PrintSubset {

	
	
	/*
	 * Given an integer array (of length n), find and print all the subsets of input
	 * array. Subsets are of length varying from 0 to n, that contain elements of
	 * the array. But the order of elements should remain same as in the input
	 * array. Note : The order of subsets are not important. Just print the subsets
	 * in different lines. Input format :
	 */
	
	
	private static void printSubset(int[] input) {
		if(input.length==0)
			return;
		printSubset(input,"",0);
	}
	
	private static void printSubset(int[] input, String output,int si) {
		if(si==input.length) {
			System.out.println(output);
			return;
		}
		printSubset(input,output+" "+input[si],si+1);
		printSubset(input, output, si+1);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String inputString=input.nextLine();
		String[] stringArray=inputString.split(" ");
		int[] intArray=new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++) {
			intArray[i]=Integer.valueOf(stringArray[i]);
		}
		printSubset(intArray);
	}
}
