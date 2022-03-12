package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

		
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String result=" ";
		String [] str = text.split(" ");
		LinkedHashSet <String> lset = new LinkedHashSet<String>(Arrays.asList(str));
		
		
		for (String word : lset) {
			result = result + word + " ";
		}
		
		System.out.println("Sentence after Removing Duplicate words: "+result);
	}
}
