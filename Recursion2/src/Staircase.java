import java.util.Scanner;

public class Staircase {

	/*
	 * A child is running up a staircase with N steps, and can hop either 1 step, 2
	 * steps or 3 steps at a time. Implement a method to count how many possible
	 * ways the child can run up to the stairs. You need to return number of
	 * possible ways W.
	 */

	private static int staircase(int n) {
		int whenFirstStepHops1 = 0;
		int whenFirstStepHops2 = 0;
		int whenFirstStepHops3 = 0;
		if (n == 0)
			return 1;
		whenFirstStepHops1 = staircase(n - 1);
		if (n > 1)
			whenFirstStepHops2 = staircase(n - 2);
		if (n > 2)
			whenFirstStepHops3 = staircase(n - 3);
		return whenFirstStepHops1 + whenFirstStepHops2 + whenFirstStepHops3;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfSteps = input.nextInt();
		System.out.println(staircase(numberOfSteps));
	}
}
