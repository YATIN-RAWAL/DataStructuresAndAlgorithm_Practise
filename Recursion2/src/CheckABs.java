import java.util.Scanner;

public class CheckABs {

	private static boolean checkAB(String input) {
		if(input.length()==0)
			return true;
		
		if(input.charAt(0)!='a')
			return false;
		
		input=input.substring(1);
		if(input.length()==0)
			return true;
		if(input.charAt(0)=='a')
			return checkAB(input);
		if(input.length()>=2 && input.charAt(0)=='b' && input.charAt(1)=='b')
			return checkAB(input.substring(2));
		
		return false;
		

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println(checkAB(inputString));
	}

}
