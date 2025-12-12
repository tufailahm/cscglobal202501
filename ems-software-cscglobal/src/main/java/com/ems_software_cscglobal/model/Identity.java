package com.ems_software_cscglobal.model;
import java.util.List;

public class Identity {

    private String identityId;
    private String userName;
    private List<String> emails;
    private List<Entitlement> entitlements;

    public Identity() {}

    public String getIdentityId() { return identityId; }
    public void setIdentityId(String identityId) { this.identityId = identityId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public List<String> getEmails() { return emails; }
    public void setEmails(List<String> emails) { this.emails = emails; }

    public List<Entitlement> getEntitlements() { return entitlements; }
    public void setEntitlements(List<Entitlement> entitlements) { this.entitlements = entitlements; }

	@Override
	public String toString() {
		return "Identity [identityId=" + identityId + ", userName=" + userName + ", emails=" + emails
				+ ", entitlements=" + entitlements + "]";
	}
    
    
    
}
