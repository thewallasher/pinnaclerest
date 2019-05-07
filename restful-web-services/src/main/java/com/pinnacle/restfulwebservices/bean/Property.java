package com.pinnacle.restfulwebservices.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Property {

	public Property (String propertyName, String value, String defaultValue) {
		this.propertyName = propertyName;
		this.defaultValue = defaultValue;
		this.value = value;
	}
	
	@NotNull
	@Size(min=5, message="Property Name should have at least 5 characters")
	private String propertyName;
	
	@NotNull
	@Size(min=5, message="Value should have at least 5 characters")
	private String value;
	
	@NotNull
	@Size(min=5, message="Value should have at least 5 characters")
	private String defaultValue;
	
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDefauleValue() {
		return defaultValue;
	}
	public void setDefauleValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	
	
}
