package com.demo;

public class DummyConnector {

    public void provision(String identityName, String entitlement) {
        System.out.println("[Connector] Provisioned " + entitlement + " for " + identityName);
    }
}
