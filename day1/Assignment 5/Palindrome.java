package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
 
		String s = "MALAYALAM";
		int l=s.length();
		String rev = "";
		
		for(int i=l-1; i>=0;i--) {
			rev=rev + s.charAt(i);
		}
			if(s.equals(rev)) {
				System.out.println("Given String is Palindrome");
			}
			else {
				System.out.println("Given String is not a Palindrome");
			}
		
		
	}

}
