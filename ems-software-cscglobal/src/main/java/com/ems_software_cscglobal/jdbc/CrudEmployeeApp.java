package com.ems_software_cscglobal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ems_software_cscglobal.utilities.DbConnection;

public class CrudEmployeeApp {
	
	Connection connection = DbConnection.getConnection();
	
	public void showAllEmployees() throws ClassNotFoundException, SQLException {


		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from employee");

		while (res.next()) {
			System.out.print(res.getString(1) + "   ");
			System.out.print(res.getString(2) + "   ");
			System.out.print(res.getString(3) + "   ");
			System.out.println(res.getString(4) + "   ");
		}
	}
	
	public void saveEmployeeInformation() throws ClassNotFoundException, SQLException {
	
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();
        
        
        PreparedStatement pstat = connection.prepareStatement("insert into employee values (?,?,?,?)");
        pstat.setInt(1, employeeId);
        pstat.setString(2, employeeName);
        pstat.setInt(3, salary);
        pstat.setString(4, mobileNumber);

        pstat.executeUpdate(); //DML
        
        System.out.println(employeeName + " your record saved");
	}
	
	
	public void deleteEmployee() throws SQLException
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to delete: ");
        int employeeId = sc.nextInt();
        sc.nextLine(); // consume newline
        
        PreparedStatement pstat = connection.prepareStatement("delete from employee where employeeId = ?");
        pstat.setInt(1, employeeId);
        
        pstat.executeUpdate();
        
        System.out.println("Your record deleted successfully");
        

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CrudEmployeeApp g = new CrudEmployeeApp();
		Scanner sc = new Scanner(System.in);
		while (true) {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                   g.saveEmployeeInformation();
                    break;

                case 2:
                  g.showAllEmployees();
                    break;

                case 3:
                  
                    break;

                case 4:
                	g.deleteEmployee();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
		
	}
}