package com.ems_software_cscglobal.json;

import java.io.File;
import java.io.IOException;

import com.ems_software_cscglobal.model.Employee;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONFile {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("oldemployee.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Employee emp = mapper.readValue(file, Employee.class);
		
		System.out.println(emp);
	}

}
