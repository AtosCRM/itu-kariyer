package com.atos.subscriber.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "customer")
@RequestScoped
public class Customer implements Serializable {

	private String customerId;
	private String name;
	private String lastname;
	private String birthDate;
	private String nationalityId;
	private String typeId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=");
		builder.append(customerId);
		builder.append(" , name=");
		builder.append(name);
		builder.append(" , lastname=");
		builder.append(lastname);
		builder.append(" , birthDate=");
		builder.append(birthDate);
		builder.append(" , nationalityId=");
		builder.append(nationalityId);
		builder.append(" , typeId=");
		builder.append(typeId);
		builder.append("]");
		return builder.toString();
	}

}
