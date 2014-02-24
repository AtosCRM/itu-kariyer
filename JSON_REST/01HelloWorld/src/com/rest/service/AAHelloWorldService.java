package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class AAHelloWorldService {
	
	//http://localhost:8082/01HelloWorld/rest/hello/yusuf
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		
		String output = "Jersey say : " + msg;
		System.out.println("msg : " + msg);
		return Response.status(200).entity(output).build();
	}
	
}
