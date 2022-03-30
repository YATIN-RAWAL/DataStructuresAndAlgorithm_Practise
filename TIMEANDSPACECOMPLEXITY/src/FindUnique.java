import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindUnique {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		String[] stringArray = inputString.split(" ");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		System.out.println(findUnique(intArray));

	}

	public static int findUnique(int[] arr) {
		HashMap<Integer, Boolean> mapValueToIsDouble = new HashMap<>();
		int unique;
		for (int i = 0; i < arr.length; i++) {
			if (mapValueToIsDouble.containsKey(arr[i])) {
				mapValueToIsDouble.put(arr[i], true);
			} else {
				mapValueToIsDouble.put(arr[i], false);
			}
		}

		Set<Entry<Integer, Boolean>> entrySet = mapValueToIsDouble.entrySet();
		for (Entry<Integer, Boolean> entry : entrySet) {
			if (!entry.getValue()) {
				unique = entry.getKey();
				return unique;
			}
		}
		return -1;
	}

	public static int findUniqueConstantSpaceComplexity(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor ^= arr[i];
		}
		return xor;
	}
}
