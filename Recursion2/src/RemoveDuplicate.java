import java.util.Scanner;

public class RemoveDuplicate {

	/*
	 * Given a string S, remove consecutive duplicates from it recursively.
	 */

	private static String removeDuplicates(String input) {
		if (input.length() == 1)
			return input;
		if (input.substring(0, 1).equals(input.substring(1, 2)))
			return removeDuplicates(input.substring(1));

		return input.substring(0, 1) + removeDuplicates(input.substring(1));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(removeDuplicates(inputString));
	}

}
