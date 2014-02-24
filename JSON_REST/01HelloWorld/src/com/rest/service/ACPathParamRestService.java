package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/userss")
public class ACPathParamRestService {

	//http://localhost:8082/01HelloWorld/rest/userss/sd
	//http://localhost:8082/01HelloWorld/rest/userss/34
	@GET
	@Path("{id}")
	public Response getUserById(@PathParam("id") String id) {
 
	   return Response.status(200).entity("getUserById is called, id : " + id).build();
 
	}
	
	//http://localhost:8082/01HelloWorld/rest/userss/2014/02/11
	@GET
	@Path("{year}/{month}/{day}")
	public Response getUserHistory(
			@PathParam("year") int year,
			@PathParam("month") int month, 
			@PathParam("day") int day) {
 
	   String date = year + "/" + month + "/" + day;
 
	   return Response.status(200)
		.entity("getUserHistory is called, year/month/day : " + date)
		.build();
 
	}
	
}
