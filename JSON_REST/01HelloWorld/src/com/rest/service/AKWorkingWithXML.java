package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.tools.Customer;

@Path("/xml/customer")
public class AKWorkingWithXML {

	// http://localhost:8082/01HelloWorld/rest/xml/customer/43
	@GET
	@Path("/{pin}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {
 
		Customer customer = new Customer();
		customer.setName("yusuf");
		customer.setPin(pin);
 
		return customer;
 
	}
	
}
