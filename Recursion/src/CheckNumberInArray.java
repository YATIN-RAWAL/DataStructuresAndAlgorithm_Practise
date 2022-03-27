import java.util.Scanner;

public class CheckNumberInArray {

	
	
	/*
	 * Given an array of length N and an integer x, you need to find if x is present
	 * in the array or not. Return true or false.
	 */
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
		if(input.length==0) {
			return false;
		}
		
		return checkNumber(input,x,0);
		
	}
	
	
	public static boolean checkNumber(int input[], int x, int i) {
		if(input.length-1==i)
			return false;
		
		if(input[i]==x)
			return true;
		
		return checkNumber(input, x, i+1);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Array"); 
		String inputString=input.nextLine();
		String[] stringArray=inputString.split(" ");
		int[] intArray=new int[stringArray.length];
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=Integer.valueOf(stringArray[i]);
		}
		System.out.println("Enter x");
		int x=input.nextInt();
		System.out.println(checkNumber(intArray, x));
		
		
	}
	
}
