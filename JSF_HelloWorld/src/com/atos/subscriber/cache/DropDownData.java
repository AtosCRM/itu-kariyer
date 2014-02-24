package com.atos.subscriber.cache;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.atos.subscriber.model.CustomerType;

@ManagedBean(name = "dropDownData")
@SessionScoped
public class DropDownData implements Serializable {

	private CustomerType[] customerType;

	public CustomerType[] getCustomerType() {
		this.customerType = new CustomerType[3];
		this.customerType[0] = new CustomerType("-1", "-Seç-");
		this.customerType[1] = new CustomerType("S", "Bireysel");
		this.customerType[2] = new CustomerType("F", "Kurumsal");
		return this.customerType;
	}

	public void setCustomerType(CustomerType[] customerType) {
		this.customerType = customerType;
	}

}
