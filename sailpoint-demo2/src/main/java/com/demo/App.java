package com.demo;


public class App {
    public static void main(String[] args) {

        ProvisioningWorkflow wf = new ProvisioningWorkflow();

    	//Success
        Identity user1 = new Identity("Tufail", "Engineering");
        wf.execute(user1, "AWS_ADMIN");

        //Access Denied
        Identity user2 = new Identity("Karthik", "HR");
        wf.execute(user2, "SAP_FINANCE");
        
        
        Identity user3 = new Identity("Thanuja", "IT");
        wf.execute(user3, "SAP_FINANCE");
        
        System.out.println("\n\nFinal Entitlements");
        
        System.out.println("For Tufail: " + user1.getEntitlements());
        System.out.println("For Karthik: " + user2.getEntitlements());
        System.out.println("For Thanuja: " + user3.getEntitlements());


    }
}
