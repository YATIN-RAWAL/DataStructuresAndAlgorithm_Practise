import java.util.Scanner;

public class RemoveX {

	/*
	 * Given a string, compute recursively a new string where all 'x' chars have
	 * been removed.
	 */

	private static String replaceX(String input) {
		if (input.length() == 0)
			return input;

		if (input.length() == 1) {
			if (input.equals("x"))
				return "";
			else
				return input;
		}
		if (input.charAt(0) == 'x')
			return replaceX(input.substring(1));

		return input.charAt(0) + replaceX(input.substring(1));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(replaceX(inputString));
	}

}
