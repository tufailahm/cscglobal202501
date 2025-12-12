package com.ems_software_cscglobal.xml;

import com.ems_software_cscglobal.model.Employee;

import java.io.File;

import javax.xml.bind.*;

public class Main {

	public static void main(String[] args) throws JAXBException {

		Employee employee = new Employee(100, "Nandini", 168000, "9876543211");

		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		File file = new File("employees.xml");
		marshaller.marshal(employee, file);

		System.out.println("Successfully written to a XML file");

	}

}
