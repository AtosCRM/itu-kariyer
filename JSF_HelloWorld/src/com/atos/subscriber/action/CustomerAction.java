package com.atos.subscriber.action;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.atos.subscriber.model.Customer;

@ManagedBean(name = "customerAction")
@RequestScoped
public class CustomerAction implements Serializable {

	@ManagedProperty(value = "#{customer}")
	private Customer customer;

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String insert() {
		try {
			customer.toString();
			if (customer.getNationalityId().equals("11111111112"))
				throw new Exception("hata");

		} catch (Exception e) {
			return "Error";
		}
		return "Success";
	}

}
