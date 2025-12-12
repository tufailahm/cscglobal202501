package com.employee_management_system;

public class Greetings {
	public void sayHello() {
		System.out.println("Hello Guest");
	}
	public boolean ageValidator(int age) {
		if(age < 18)
			return false;
		else
			return true;
	}
	public int calculateGiftCardValue(int age) {
	
	    int eligibleYears = age - 18;   // Only years above 18 are counted
	    int giftPerYear = 50;
	    return eligibleYears * giftPerYear;
	}
	public void greetUser(String username,String gender,int age) {
		
		boolean result = ageValidator(age);
		if(result == true) {
			
			int value = calculateGiftCardValue(age);
			if (gender.equals("male"))
				System.out.println("Hello Mr. " + username+" Gift value :"+value);
			else
				System.out.println("Hello Ms/Mrs. " + username+" Gift value :"+value);
		}
	}	
	public static void main(String[] args) {
			Greetings greetings = new Greetings();
			greetings.sayHello();
			greetings.greetUser("Vinay","male",40);
			greetings.greetUser("Neha","female",89);
	}
}