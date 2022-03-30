import java.util.Arrays;
import java.util.Scanner;

public class ReturnAllCodes {

	private static String[] returnAllCodes(String inputNumber) {
		if (inputNumber.length() == 0)
			return new String[] { "" };
		if (inputNumber.length() == 1) {
			if (inputNumber.equals("0"))
				return new String[] { "" };
			else {
				Character ch = (char) (96 + Integer.valueOf(inputNumber));
				return new String[] { ch.toString() };
			}
		}
		Character with1Digit = (char) (96 + Integer.valueOf(inputNumber.substring(0, 1)));
		String[] codesWithout1Digit = returnAllCodes(inputNumber.substring(1));
		for (int i = 0; i < codesWithout1Digit.length; i++) {
			codesWithout1Digit[i] = with1Digit + codesWithout1Digit[i];
		}
		Integer twoDigitsIntValues = Integer.valueOf(inputNumber.substring(0, 2));
		if (twoDigitsIntValues > 26) {
			return codesWithout1Digit;
		}
		Character chWith2Digit = (char) (96 + twoDigitsIntValues);
		String[] codesWithoutFirstTwoDigit = returnAllCodes(inputNumber.substring(2));
		for (int i = 0; i < codesWithoutFirstTwoDigit.length; i++) {
			codesWithoutFirstTwoDigit[i] = chWith2Digit + codesWithoutFirstTwoDigit[i];
		}

		String[] output = new String[codesWithout1Digit.length + codesWithoutFirstTwoDigit.length];
		int outputIndex = 0;
		for (int i = 0; i < codesWithout1Digit.length; i++) {
			output[outputIndex] = codesWithout1Digit[i];
			outputIndex++;
		}
		for (int i = 0; i < codesWithoutFirstTwoDigit.length; i++) {
			output[outputIndex] = codesWithoutFirstTwoDigit[i];
			outputIndex++;
		}
		return output;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputNumber = input.nextLine();
		System.out.println(Arrays.toString(returnAllCodes(inputNumber)));
	}
}
