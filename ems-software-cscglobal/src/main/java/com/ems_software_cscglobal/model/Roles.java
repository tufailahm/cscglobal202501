package com.ems_software_cscglobal.model;

import java.util.Arrays;

public class Roles {
		String username;
		int roleId;
		String permissions[];
		int secretCodes [] = { 12,912,2323,23};
		String name[] = new String[8];
		public Roles() {		//constructor
			username = "Rahul";
			roleId = 987;
			permissions = new String[]{ "READ", "WRITE","EXECUTE"};
			try {
				System.out.println(secretCodes[38]);
			} catch (Exception e) {
				
			}
		}
		@Override
		public String toString() {
			return "Roles [username=" + username + ", roleId=" + roleId + ", permissions="
					+ Arrays.toString(permissions) + "]";
		}
		public static void main(String[] args) {
			Roles roles = new Roles();
			System.out.println(roles);
			System.out.println("Thanks for using my program");
		}
}
