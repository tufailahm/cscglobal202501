package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Identity {
	private String name;
	private String dept;
	private List<String> entitlements = new ArrayList<>();

	public Identity(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	public void addEntitlement(String entitlement) {
		entitlements.add(entitlement);
	}

	public List<String> getEntitlements() {
		return entitlements;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
}
