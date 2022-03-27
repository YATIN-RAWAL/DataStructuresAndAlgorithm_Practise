import java.util.Scanner;

public class SumOfAllElementsOfArray {

	
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0) {
			return 0;
		}
		return sum(input,0);
	}
	
	
	
	public static int sum(int input[],int i) {
		if(i==input.length-1) {
			return input[i];
		}
		
		return input[i]+sum(input,i+1);
		
	}
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String inputString=input.nextLine();
		String[] stringArray=inputString.split(" ");
		int[] intArray=new int[stringArray.length];
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=Integer.valueOf(stringArray[i]);
		}
		System.out.println(sum(intArray));
		
	}
}
