package com.ems_software_cscglobal.model;

import com.ems_software_cscglobal.utilities.ExecutiveCafe;
import com.ems_software_cscglobal.utilities.Lounge;

public class Manager extends Employee implements Lounge,ExecutiveCafe{

	private int manager_id;
	private int department_id;
	
	public Manager() {
	}	
	@Override
	public void changeSalary(int percentage) {
		super.changeSalary(percentage);
		//increment 5000 more for managers
		this.setSalary(this.getSalary() + 5000);
	}
	public Manager(int manager_id, int department_id) {
		super();
		this.manager_id = manager_id;
		this.department_id = department_id;
	}
	public Manager(int employeeId, String employeeName, int salary, String mobileNumber) {
		super(employeeId, employeeName, salary, mobileNumber);
		// TODO Auto-generated constructor stub
	}
	public Manager(int employeeId, String employeeName, int salary) {
		super(employeeId, employeeName, salary);
		// TODO Auto-generated constructor stub
	}
	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", department_id=" + department_id + ", getEmployeeName()="
				+ getEmployeeName() + ", getSalary()=" + getSalary() + ", getMobileNumber()=" + getMobileNumber()
				+ ", getEmployeeId()=" + getEmployeeId() + "]";
	}

	@Override
	public void playPool() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyLoungeServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void termiate() {
		// TODO Auto-generated method stub
		
	}	

	
}