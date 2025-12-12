package com.ems_software_cscglobal.model;
public class Entitlement {
    private String name;
    private String value;

    public Entitlement() {}

    public Entitlement(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

	@Override
	public String toString() {
		return "Entitlement [name=" + name + ", value=" + value + "]";
	}
    
}
