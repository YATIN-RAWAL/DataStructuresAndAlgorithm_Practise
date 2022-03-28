import java.util.Scanner;

public class StringToInteger {

	/*
	 * Write a recursive function to convert a given string into the number it
	 * represents. That is input will be a numeric string that contains only
	 * numbers, you need to convert the string into corresponding integer and return
	 * the answer.
	 */

	private static int stringToInteger(String input) {
		if (input.length() < 2)
			return Integer.valueOf(input);

		return stringToInteger(input, input.length() - 1);
	}

	private static int stringToInteger(String input, int index) {
		if (index < 0)
			return 0;

		int numberAtCurrentIndex = Integer.valueOf(input.substring(index, index + 1));
		return (int) ((numberAtCurrentIndex * Math.pow(10, input.length() - (index + 1)))
				+ stringToInteger(input, index - 1));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(stringToInteger(inputString));
	}
}
