import java.util.Scanner;

public class PrintAllPermutations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		printAllPermutations(inputString);

	}

	private static void printAllPermutations(String input) {
		if (input.length() == 0) {
			return;
		}
		printAllPermutations(input, "");
	}

	private static void printAllPermutations(String input, String output) {
		if (input.length() == 1) {
			System.out.println(output + input);
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			if (i == 0) {
				printAllPermutations(input.substring(1), output + input.substring(0, 1));
			} else {
				printAllPermutations(input.substring(0, i) + input.substring(i + 1),
						output + input.substring(i, i + 1));
			}
		}
	}
}
