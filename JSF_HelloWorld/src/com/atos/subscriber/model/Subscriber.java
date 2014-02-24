package com.atos.subscriber.model;

import java.io.Serializable;

public class Subscriber implements Serializable {

	private String customerId;
	private String gsmNo;
	private String gsmType;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getGsmNo() {
		return gsmNo;
	}

	public void setGsmNo(String gsmNo) {
		this.gsmNo = gsmNo;
	}

	public String getGsmType() {
		return gsmType;
	}

	public void setGsmType(String gsmType) {
		this.gsmType = gsmType;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subscriber [customerId=");
		builder.append(customerId);
		builder.append(" , gsmNo=");
		builder.append(gsmNo);
		builder.append(" , gsmType=");
		builder.append(gsmType);
		builder.append("]");
		return builder.toString();
	}

}
