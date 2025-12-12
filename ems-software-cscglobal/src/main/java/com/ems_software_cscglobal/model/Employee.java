package com.ems_software_cscglobal.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.ems_software_cscglobal.exceptions.NegativeSalaryException;
import com.ems_software_cscglobal.exceptions.OverIncrementException;

@XmlRootElement
public class Employee {

	// private fields
	private int employeeId;
	private String employeeName;
	private int salary;
	private String mobileNumber;

	// default constructor
	public Employee() {
		System.out.println("Employee Constructor called");
		employeeId = -1;
		employeeName = "NotAvailable";
		salary = 0;
		mobileNumber = "88888888888";
	}

	// Parameterized constructor
	public Employee(int employeeId, String employeeName, int salary, String mobileNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
	}

	public Employee(int employeeId, String employeeName, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void display() {
		System.out.println("Employee id :" + employeeId);
		System.out.println("Employee name :" + employeeName);
		System.out.println("Employee salary :" + salary);
		System.out.println("Employee mobile :" + mobileNumber);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary < 0) {
			this.salary = 0;
			throw new NegativeSalaryException("Salary cannot be negative");
		} else {
			this.salary = salary;
		}
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	// give increment
	public void changeSalary(int percentage) {
		if(percentage>100)
				throw new OverIncrementException("Increment cannot be more than 100%");
		salary = salary + (salary / 100) * percentage;
	}

	// give increment
	public void changeSalary(int percentage, int yearOfExperience) {
		if (yearOfExperience >= 10) {
			percentage += 5;
			salary = salary + (salary / 100) * percentage;
		}
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
