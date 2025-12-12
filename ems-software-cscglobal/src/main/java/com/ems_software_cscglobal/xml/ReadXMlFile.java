package com.ems_software_cscglobal.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ems_software_cscglobal.model.Employee;

public class ReadXMlFile {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		File file = new File("newemployee.xml");
		Employee emp = (Employee) unmarshaller.unmarshal(file);
		
		System.out.println(emp);
	}
}
