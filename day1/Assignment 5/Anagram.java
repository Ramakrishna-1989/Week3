package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s = "stops";
		String s1 = "potss";
		
		int l=s.length();
		int l1=s1.length();
		
		boolean status=true;
		
		if(l!=l1) {
			status=false;
		}else {
		
	 char[] c=s.toCharArray();
	 char[] c1=s1.toCharArray();
	 Arrays.sort(c);
	 Arrays.sort(c1);
	
	status=Arrays.equals(c, c1);
		}
	 
		
		if(status) {
		System.out.println("Given String is Anagram");
	 }else {
		System.out.println("Given String is not Anagram");
	 }
	 
	}

}
