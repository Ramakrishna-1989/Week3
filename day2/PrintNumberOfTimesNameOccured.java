package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintNumberOfTimesNameOccured {

	public static void main(String[] args) {

		int count=0;
		
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		list.add("Adam");
		list.add("George");
		list.add("Adam");

	System.out.println(list);
	
	Set<String> s = new HashSet<String>(list);
	
	for(String name : s) {
		System.out.println( "no of occurneces Adam: " +Collections.frequency(list, "Adam"));
		break;
	}
		}
		
	
	
	
	
	}

