package com.ems_software_cscglobal.collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class Participants {

	public static void main(String[] args) {
		
		//ArrayList names = new ArrayList();
		LinkedList<String> names = new LinkedList<String>();

		names.add("Vara");
		names.add("Rashi");
		names.add("Thanuja");
		names.add("Naveeni");
		names.add("Naveeni");
		names.add("Suyog");
		
		names.add(2, "Karthik");
		Collections.sort(names);
		names.remove(3);
		
		System.out.println(names);
		
		int result = Collections.binarySearch(names,"Suyog");
		
		System.out.println("Number of employees :"+names.size());
		System.out.println(names.contains("Ahmed"));
		
		System.out.println("Syoug is at position :"+result);
	}
}