package week3.day1;

public class FindVowelsInString {

	public static void main(String[] args) {

		String str = "Education";
		int count=0;
		String str1 = str.toLowerCase();
		System.out.println(str1);
		
		for(int i=0; i<str.length();i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u') {
				count++;
			}
		}
	
		System.out.println("Number of vowels in Education is: "+count);

	}

}
