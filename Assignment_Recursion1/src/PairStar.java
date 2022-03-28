import java.util.Scanner;

public class PairStar {

	/*
	 * Given a string S, compute recursively a new string where identical chars that
	 * are adjacent in the original string are separated from each other by a "*"
	 */
	
	
	public static String addStars(String s) {
		// Write your code here
		if(s.length()<2)
			return s;
		
		if(s.charAt(0)==s.charAt(1))
			return s.substring(0,1)+'*'+addStars(s.substring(1));

		return s.substring(0,1)+addStars(s.substring(1));
	}
	
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String inputString=input.nextLine();
		System.out.println(addStars(inputString));
	}
}
