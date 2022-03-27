import java.util.Scanner;

public class SumOfDigitsOfAnInteger {

	/*
	 * Write a recursive function that returns the sum of the digits of a given
	 * integer.
	 */

	private static int sumOfDigits(int input) {
		if (input < 9) {
			return input;
		}

		return (input % 10) + sumOfDigits(input / 10);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		System.out.println(sumOfDigits(integer));
	}
}
