package com.ems_software_cscglobal.collectiondemos;

import java.util.*;
public class Players {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String> userDetails = new LinkedHashMap<Integer, String>();
		
		userDetails.put(1918171, "Tufail");
		userDetails.put(123, "Neha");
		userDetails.put(22323, "Jay");
		userDetails.put(232, "Karthik");
		userDetails.put(32, "Vara");
		
		//fetch the data from sailpoint json and store on userDetails collection
		
		System.out.println(userDetails);
		
		
	}
}
