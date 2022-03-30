import java.util.Scanner;

public class PrintAllCodes {

	/*
	 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a
	 * numeric string S. Write a program to print the list of all possible codes
	 * that can be generated from the given string.
	 */

	private static Character getCorrespondingChar(String input) {
		int value = Integer.valueOf(input);
		if (value > 26)
			return null;

		return (char) (96 + value);
	}

	private static void printAllCodes(String inputString) {
		printAllCodes(inputString, "");
	}

	private static void printAllCodes(String input, String output) {
		if (input.length() == 0) {
			System.out.println(output);
			return;
		}
		if (input.length() == 1) {
			System.out.println(output + getCorrespondingChar(input));
			return;
		}
		Character firstDigitCharValue = getCorrespondingChar(input.substring(0, 1));
		Character twoDigitCharValue = getCorrespondingChar(input.substring(0, 2));
		printAllCodes(input.substring(1), output + firstDigitCharValue);
		if (twoDigitCharValue != null)
			printAllCodes(input.substring(2), output + twoDigitCharValue);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		printAllCodes(inputString);
	}

}
