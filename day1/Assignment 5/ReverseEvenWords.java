package week3.day1;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {

  		String test = "I am a software tester"; 
  		
  		String[] str =test.split(" ");
   		String reverse="";
  		
   		for(int i=0; i<str.length;i++) {
   			
   			if(i%2!=0) {
   				char[] oddvalue = str[i].toCharArray();
   				
   				for(int j=oddvalue.length-1; j>=0; j--) {
   					reverse=reverse + oddvalue[j];
   				}
   				
   				reverse = reverse + " ";
   			}else {
   				reverse = reverse + str[i] + " ";
   			}
   		
   			   			
   		}
		System.out.println(reverse.trim());

   		
  		
		
	}
}
		
	