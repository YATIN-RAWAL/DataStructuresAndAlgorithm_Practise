import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReturnAllPremutation {


	private static String[] permutationOfString(String inputString) {
		if (inputString.length() == 0)
			return new String[] { "" };
		if (inputString.length() == 1) {
			return new String[] { inputString };
		}
		String[] possiblePermutationForRemaingchara = null;
		ArrayList<String> permutationArrayList=new ArrayList<String>();
		for (int i = 0; i < inputString.length(); i++) {
			String firstCharacter = inputString.substring(i, i + 1);
			if (i == 0) {
				possiblePermutationForRemaingchara = permutationOfString(inputString.substring(1));
			} else {
				possiblePermutationForRemaingchara = permutationOfString(
						inputString.substring(0, i) + inputString.substring(i + 1));
			}
			for (int j = 0; j < possiblePermutationForRemaingchara.length; j++) {
				permutationArrayList.add(firstCharacter + possiblePermutationForRemaingchara[j]);
			}

		}

		String[] outputString = new String[permutationArrayList.size()];
		for (int i = 0; i < outputString.length; i++) {
			outputString[i] = permutationArrayList.get(i);
		}
		return outputString;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(Arrays.toString(permutationOfString(inputString)));
	}
}
