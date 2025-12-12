package com.ems_software_cscglobal.iodemos;

import java.io.*;

public class SaveLogs {

	public static void main(String[] args) throws IOException {

		File f = new File("myname.txt");	

		FileWriter fileWriter = new FileWriter(f,true);

		String word = "Hello Tufail";
		fileWriter.write(word);

		fileWriter.close();

		System.out.println("Successfully Written");

	}

}
