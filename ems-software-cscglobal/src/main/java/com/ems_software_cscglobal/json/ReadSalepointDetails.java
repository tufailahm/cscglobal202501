package com.ems_software_cscglobal.json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.ems_software_cscglobal.model.Identity;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadSalepointDetails {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file = new File("salepoint.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Identity identity = mapper.readValue(file,Identity.class);
		
		System.out.println(identity);

		List<String> emails = identity.getEmails();
		
		System.out.println(emails.size());
	}

}
