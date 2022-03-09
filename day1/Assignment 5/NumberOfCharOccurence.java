package week3.day1;

public class NumberOfCharOccurence {

	public static void main(String[] args) {

		String str = "Welcome to Chennai";
		int l1 = str.length();
		int count = 0;
		char exp = 'e';
		
		for(int i=0 ; i<l1;i++) {
			
			if(str.charAt(i) == exp) {
				count++;
			}
			}
	
		System.out.println("Number of times the char occured in Given String is : "+count);

	}
}
