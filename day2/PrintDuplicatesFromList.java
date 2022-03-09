package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesFromList {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
	
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		
		
		for(String name: list) {
			if(set.add(name)==false) {
				System.out.println(name + " Is Duplicated");
			
			}
			
		}
	
	}

}
