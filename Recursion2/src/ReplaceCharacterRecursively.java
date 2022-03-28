import java.util.Scanner;

public class ReplaceCharacterRecursively {

	/*
	 * Given an input string S and two characters c1 and c2, you need to replace
	 * every occurrence of character c1 with character c2 in the given string. Do
	 * this recursively.
	 */

	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 0)
			return input;

		if (input.charAt(0) == c1)
			return c2 + replaceCharacter(input.substring(1), c1, c2);

		return input.substring(0, 1) + replaceCharacter(input.substring(1), c1, c2);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String inputString = input.nextLine();
		System.out.println("enter char");
		String a = input.next();
		String b = input.next();
		System.out.println(replaceCharacter(inputString, a.charAt(0), b.charAt(0)));
	}

}
