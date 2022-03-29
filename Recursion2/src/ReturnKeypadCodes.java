import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReturnKeypadCodes {

	/*
	 * Given an integer n, using phone keypad find out all the possible strings that
	 * can be made using digits of input n. Return empty string for numbers 0 and 1.
	 * Note : 1. The order of strings are not important. 2. Input and output has
	 * already been managed for you. You just have to populate the output array and
	 * return the count of elements populated in the output array.
	 */

	private static ArrayList<String[]> keypad = new ArrayList<String[]>();
	static {
		keypad.add(new String[] { "" });
		keypad.add(new String[] { "" });
		keypad.add(new String[] { "a", "b", "c" });
		keypad.add(new String[] { "d", "e", "f" });
		keypad.add(new String[] { "g", "h", "i" });
		keypad.add(new String[] { "j", "k", "l" });
		keypad.add(new String[] { "m", "n", "o" });
		keypad.add(new String[] { "p", "q", "r", "s" });
		keypad.add(new String[] { "t", "u", "v" });
		keypad.add(new String[] { "w", "x", "y", "z" });
	}

	private static String[] returnKeypadCodes(int input) {
		if (input <= 9) {
			return keypad.get(input);
		}

		int currentIndex = input % 10;
		String[] currentIndexKeys = keypad.get(currentIndex);
		String[] outputForRemainingKeys = returnKeypadCodes(input / 10);

		String[] possibleOutput = new String[outputForRemainingKeys.length * currentIndexKeys.length];
		int indexForPossibleOutput = 0;
		for (String remainingKeys : outputForRemainingKeys) {
			for (String keyFromCurrentIndex : currentIndexKeys) {
				possibleOutput[indexForPossibleOutput] = remainingKeys + keyFromCurrentIndex;
				indexForPossibleOutput++;
			}
		}
		return possibleOutput;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		System.out.println(Arrays.toString(returnKeypadCodes(inputNumber)));

	}
}
