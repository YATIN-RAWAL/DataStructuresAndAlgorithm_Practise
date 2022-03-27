import java.util.Scanner;

public class CalculatePower {

	
	/*
	 * Write a program to find x to the power n (i.e. x^n). Take x and n from the
	 * user. You need to return the answer.
	 */

	
	private static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		
		return x*power(x,n-1);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int n=input.nextInt();
		System.out.println(power(x,n));          
	}
}
