package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("users")
public class ABUserRestService {

	//http://localhost:8082/01HelloWorld/rest/users/23
	@GET
	@Path("{id : \\d+}") //support digit only
	public Response getUserById(@PathParam("id") String id) {
 
	   return Response.status(200).entity("getUserById is called, id : " + id).build();
 
	}
 
	//http://localhost:8082/01HelloWorld/rest/users/username/s3
	@GET
	@Path("/username/{username : [a-zA-Z][a-zA-Z_0-9]}")
	public Response getUserByUserName(@PathParam("username") String username) {
 
	   return Response.status(200).entity("getUserByUserName is called, username : " + username).build();
 
	}
 
	//http://localhost:8082/01HelloWorld/rest/users/books/3
	@GET
	@Path("/books/{isbn : \\d+}")
	public Response getUserBookByISBN(@PathParam("isbn") String isbn) {
 
	   return Response.status(200).entity("getUserBookByISBN is called, isbn : " + isbn).build();
 
	}
	
}
