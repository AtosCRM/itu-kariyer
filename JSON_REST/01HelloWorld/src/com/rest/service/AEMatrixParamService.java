package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("matrixparam/books")
public class AEMatrixParamService {

	//http://localhost:8082/01HelloWorld/rest/matrixparam/books/2011
	//http://localhost:8082/01HelloWorld/rest/matrixparam/books/2011;author=yusuf
	//http://localhost:8082/01HelloWorld/rest/matrixparam/books/2011;author=yusuf;country=turkey
	//http://localhost:8082/01HelloWorld/rest/matrixparam/books/2011;country=turkey;author=veli
	@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {
 
		return Response
			.status(200)
			.entity("getBooks is called, year : " + year+ ", author : " + author + ", country : " + country)
			.build();
 
	}
	
}
