import java.util.Scanner;

public class CheckPalindrome {

	/*
	 * Check whether a given String S is a palindrome using recursion. Return true
	 * or false.
	 */

	private static boolean checkPalindrome(String input) {
		if (input.length() == 0 || input.length()==1)
			return true;

		if (input.substring(0, 1).equals(input.substring(input.length() - 1,input.length()))) {
			return checkPalindrome(input.substring(1, input.length() - 1));
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(checkPalindrome(inputString));
	}

}
