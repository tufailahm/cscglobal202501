package com.ems_software_cscglobal.model;

public class AccessCard extends Card{

	public int chipCode;

	@Override
	public void activateCard() {
		System.out.println(cardNumber+ "got activated");
		
	}

	@Override
	public void deactivateCard() {
		System.out.println(cardNumber+ "got deactivated");
		
	}

	@Override
	public void issueTemporaryCard() {
		System.out.println(cardNumber+ "issued temporarily");
	}

	@Override
	public String toString() {
		return "AccessCard [chipCode=" + chipCode + ", cardNumber=" + cardNumber + ", issueDate=" + issueDate + "]";
	}

	
	
}
