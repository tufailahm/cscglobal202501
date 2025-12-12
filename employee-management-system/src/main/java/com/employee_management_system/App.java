package com.employee_management_system;

import finance.Salary;
import hr.Employee;

public class App
{
	public void display() {
		System.out.println( "Display Called" );
	}
    public static void main( String[] args )
    {
        App app = new App();
        app.display();
        Employee e = new Employee();
        e.swipeAccessCard();
        Salary s = new Salary();
        s.getSalary();
        
    }
}