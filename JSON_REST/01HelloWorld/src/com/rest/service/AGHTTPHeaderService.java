package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/httpheader")
public class AGHTTPHeaderService {

	//http://localhost:8082/01HelloWorld/rest/httpheader/get
	@GET
	@Path("/get")
	public Response addUser(@HeaderParam("user-agent") String userAgent) {
 
		return Response.status(200)
			.entity("addUser is called, userAgent : " + userAgent)
			.build();
 
	}
	
	//http://localhost:8082/01HelloWorld/rest/httpheader/get2
	@GET
	@Path("/get2")
	public Response addUser(@Context HttpHeaders headers) {
 
		String userAgent = headers.getRequestHeader("user-agent").get(0);
 
		return Response.status(200)
			.entity("addUser is called, userAgent : " + userAgent)
			.build();
 
	}
	
	//http://localhost:8082/01HelloWorld/rest/httpheader/get3
	@GET
	@Path("/get3")
	public Response headerList(@Context HttpHeaders headers) {
		
		String userAgent = headers.getRequestHeader("user-agent").get(0);
		
		for(String header : headers.getRequestHeaders().keySet()){
			System.out.println(header + " : " + headers.getRequestHeaders().get(header));
		}
		
		return Response.status(200)
				.entity("addUser is called, userAgent : " + userAgent)
				.build();
		
	}
	
}
