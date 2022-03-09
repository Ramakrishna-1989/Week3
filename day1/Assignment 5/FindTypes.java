package week3.day1;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] ch = test.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			
			if(Character.isLetter(ch[i])) {
				System.out.println("letter: "+ch[i]);
			}
			else if(Character.isDigit(ch[i])) {
				System.out.println("Number :"+ch[i]);
			}
			else if(Character.isSpace(ch[i])) {
				System.out.println("space :"+ch[i]);
			}
			else {
				System.out.println("SpecialCharacter :"+ch[i]);
			}
		}
	
	}

}
