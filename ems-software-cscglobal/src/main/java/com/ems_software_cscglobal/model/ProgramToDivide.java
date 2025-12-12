package com.ems_software_cscglobal.model;

import java.util.Scanner;

public class ProgramToDivide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0,num2=0,result=0;
		
		try {
			System.out.println("Enter first number : ");
			num1 = sc.nextInt();
			
			System.out.println("Enter second number : ");
			num2 = sc.nextInt();
			
			result = num1 / num2;
		} 
		catch (Exception e) {
			System.out.println("Some problem occurred "+e);
		}
		finally {
				//closing the resources
				System.out.println("##Finally block called");
		}
		
		System.out.println("Result is :"+result);
		
		
	}
}
