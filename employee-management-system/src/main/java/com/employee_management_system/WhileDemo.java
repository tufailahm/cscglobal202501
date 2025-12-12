package com.employee_management_system;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 1;
		//pre tested loop
		while (i <= 8) {
			System.out.println(i);
			i++;
		}
		
		int j=100;
		//post test loop
		do
		{
			System.out.println("Attempt number :"+j);
			j++;
		}while(j<=10);
	}
}
