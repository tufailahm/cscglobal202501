package com.ems_software_cscglobal.model;

import java.util.Arrays;

public class CountingEmployees {

	int num1=100;
	static int num2=200;
	public void display() {
		num1++;
	}
	public static void display2() {
		num2++;
	}
	public static void main(String[] args) {
		
		CountingEmployees e1 = new CountingEmployees();
		CountingEmployees e2 = new CountingEmployees();
		e1.display();
		e2.display2();
		System.out.println(e1.num1);
		System.out.println(e1.num2);
		
		System.out.println(e2.num1);
		System.out.println(e2.num2);
		
		CountingEmployees.display2();
		
		
		
	}
}
