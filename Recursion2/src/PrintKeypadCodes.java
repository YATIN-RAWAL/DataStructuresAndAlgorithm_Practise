import java.util.ArrayList;
import java.util.Scanner;

public class PrintKeypadCodes {

	private static ArrayList<String[]> keypadAlphs = new ArrayList<String[]>();
	static {
		keypadAlphs.add(new String[] { "" });
		keypadAlphs.add(new String[] { "" });
		keypadAlphs.add(new String[] { "a", "b", "c" });
		keypadAlphs.add(new String[] { "d", "e", "f" });
		keypadAlphs.add(new String[] { "g", "h", "i" });
		keypadAlphs.add(new String[] { "j", "k", "l" });
		keypadAlphs.add(new String[] { "m", "n", "o" });
		keypadAlphs.add(new String[] { "p", "q", "r", "s" });
		keypadAlphs.add(new String[] { "t", "u", "v" });
		keypadAlphs.add(new String[] { "w", "x", "y", "z" });
	}

	private static void printkeypadCode(int input) {
		printKeypadCode(input, "");
	}

	private static void printKeypadCode(int input, String output) {
		if (input == 0) {
			System.out.println(output);
			return;
		}

		int onesIndexValue = input % 10;
		String[] onesIndexArray = keypadAlphs.get(onesIndexValue);
		for (String onesIndexKey : onesIndexArray) {
			printKeypadCode(input / 10, onesIndexKey + output);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		printkeypadCode(number);
	}
}
