package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.tools.ITransaction;

@Component
@Path("/payment")
public class PaymentService {

	@Autowired
	ITransaction iTransaction;
	
	// http://localhost:8082/02SpringIntegration/rest/payment/save
	@GET
	@Path("/save")
	public Response savePayment() {
 
		String result = iTransaction.save();
 
		return Response.status(200).entity(result).build();
	}
	
}
