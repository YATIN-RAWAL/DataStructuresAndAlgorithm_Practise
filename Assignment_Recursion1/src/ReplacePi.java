import java.util.Scanner;

public class ReplacePi {

	/*
	 * Given a string, compute recursively a new string where all appearances of
	 * "pi" have been replaced by "3.14".
	 */

	private static String replacePi(String input) {
		if (input.length() < 2)
			return input;

		if (input.charAt(0) == 'p' && input.charAt(1) == 'i')
			return "3.14" + replacePi(input.substring(2));

		return input.charAt(0) + replacePi(input.substring(1));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(replacePi(inputString));

	}
}
