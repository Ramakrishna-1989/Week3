package week3.day2;

import java.util.Arrays;
import java.util.HashSet;


public class FindIntersection {

	public static void main(String[] args) {

		
		Integer [] arr = {3,2,11,4,6,7};
		Integer [] arr1 = {1,2,8,4,9,7};
		
		  HashSet<Integer> set = new HashSet<Integer>(); 		
		
		set.addAll(Arrays.asList(arr));
		set.retainAll(Arrays.asList(arr1));
		
		System.out.println(set);
		
		//convert to array
		Integer[] intersection = {};
	    intersection = set.toArray(intersection);
	     
	    System.out.println(Arrays.toString(intersection));
		
	
	}

}
