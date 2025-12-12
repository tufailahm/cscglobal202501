package com.demo;


public class ProvisioningWorkflow {

    public void execute(Identity identity, String entitlement) {

        System.out.println("----------Starting workflow for: " + identity.getName());

        ProvisioningRule rule = new ProvisioningRule();
        DummyConnector connector = new DummyConnector();

        boolean approved = rule.approveAccess(identity, entitlement);

        if (!approved) {
            System.out.println("Access denied by rule for: " + entitlement);
            return;
        }

        connector.provision(identity.getName(), entitlement);
        identity.addEntitlement(entitlement);

        System.out.println("-------------Workflow completed for " + identity.getName()+"\n");
    }
}
