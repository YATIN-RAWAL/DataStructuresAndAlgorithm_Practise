import java.util.Scanner;

public class MultiplicationOfTwoNumbers {

	/*
	 * Given two integers M & N, calculate and return their multiplication using
	 * recursion. You can only use subtraction and addition for your calculation. No
	 * other operators are allowed.
	 */

	private static int multiplyTwoNumbers(int m, int n) {
		if (m == 0 || n == 0)
			return 0;

		if (m == 1)
			return n;
		if (n == 1)
			return m;

		return m + multiplyTwoNumbers(m, n - 1);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		System.out.println(multiplyTwoNumbers(firstNumber, secondNumber));
	}
}
