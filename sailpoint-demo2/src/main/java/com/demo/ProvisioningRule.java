package com.demo;


public class ProvisioningRule {

	public boolean approveAccess(Identity identity, String entitlement) {
		if (identity.getDept().equalsIgnoreCase("HR") && entitlement.equals("SAP_FINANCE")) {
			return false; // HR cannot access SAP Finance
		}
		if (identity.getDept().equalsIgnoreCase("IT") && entitlement.equals("SAP_FINANCE")) {
			return false; // HR cannot access SAP Finance
		}
		return true;
	}
}
