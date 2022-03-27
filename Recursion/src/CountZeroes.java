import java.util.Scanner;

public class CountZeroes {

	/*
	 * Given an integer N, count and return the number of zeros that are present in
	 * the given integer using recursion
	 */

	private static int countZeroes(int input) {
		if (input == 0)
			return 1;
		if (input < 9)
			return 0;

		if (input % 10 == 0)
			return 1 + countZeroes(input / 10);

		return countZeroes(input / 10);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		System.out.println(countZeroes(inputNumber));
	}

}
