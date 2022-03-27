import java.util.Scanner;

public class GeometricSum_GP {

	/*
	 * Given k, find the geometric sum i.e. 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
	 */

	private static double geometricSum(int k) {
		if (k == 0)
			return 1;
		return geometricSum(k, 0, 1);
	}

	private static double geometricSum(int k, int index, double prevValue) {
		if (index == k)
			return prevValue;

		return prevValue + geometricSum(k, index + 1, prevValue / 2);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		System.out.println(geometricSum(k));
	}
}
