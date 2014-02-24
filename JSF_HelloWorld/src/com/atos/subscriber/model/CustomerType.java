package com.atos.subscriber.model;

import java.io.Serializable;

public class CustomerType implements Serializable {
	
	private String typeId;
	private String typeDescription;
	
	
	public CustomerType(String typeId, String typeDescription) {
		super();
		this.typeId = typeId;
		this.typeDescription = typeDescription;
	}
	
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeDescription() {
		return typeDescription;
	}
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}
	
	
	
	

}
