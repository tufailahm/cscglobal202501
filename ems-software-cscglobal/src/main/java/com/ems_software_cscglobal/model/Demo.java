package com.ems_software_cscglobal.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {

	public void display() throws ClassNotFoundException {
		System.out.println("Hello display called");
		//load driver sailpoint
		Class.forName("com.sailpoint.identityiq");
		System.out.println("Display called finished");
	}
	
	public void display2() throws ClassNotFoundException {
		System.out.println("Hello display called");
		//load driver sailpoint
		Class.forName("com.sailpoint.identityiq");
		System.out.println("Display called finished");
	}
	
	public void displayContentFromFile() throws FileNotFoundException {
		
		File file = new File("d:\\hello.txt");
		FileInputStream stream = new FileInputStream(file);
				
		
	}
	public static void main(String[] args)  {
		Demo d = new Demo();
		try {
			d.display();
			d.display2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			d.displayContentFromFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("MAIN FINISHED");
		
	}
}
