package com.ems_software_cscglobal.model;

import java.util.Date;

public abstract class Card {
			public int cardNumber;
			public Date issueDate;
			
			public abstract void activateCard() ;
			public abstract void deactivateCard(); 
			public abstract void issueTemporaryCard();
			
			public void blockCard() {
					//code here to block
					System.out.println("Card Blocked");
			}
}
