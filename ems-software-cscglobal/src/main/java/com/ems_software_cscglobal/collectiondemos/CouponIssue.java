package com.ems_software_cscglobal.collectiondemos;

import java.util.*;

public class CouponIssue {
	public static void main(String[] args) {
		LinkedHashSet<Integer> coupons = new LinkedHashSet<Integer>();
		
		coupons.add(918181);
		coupons.add(123);
		coupons.add(657);
		coupons.add(342);
		coupons.add(2534);
		
		System.out.println(coupons);
		
		//Print only even number coupons
		System.out.println("Printing only even number coupons : ");
		Iterator<Integer> i = coupons.iterator();
		
		while(i.hasNext()) {
			int data = i.next();
			if(data%2==0) {
				System.out.println(data);
			}
		}
	}
}
