package com.rest.service;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/file")
public class AHDownloadFileService {

	private static final String FILE_PATH_TEXT = "c:\\jaxrs-files\\file.log";
	private static final String FILE_PATH_IMG = "c:\\jaxrs-files\\sample.png";
	private static final String FILE_PATH_PDF = "c:\\jaxrs-files\\sample.pdf";
	private static final String FILE_PATH_EXCEL = "c:\\jaxrs-files\\sample.xlsx";
	
	//http://localhost:8082/01HelloWorld/rest/file/gettext
	@GET
	@Path("/gettext")
	@Produces("text/plain")
	public Response getFileText() {
 
		File file = new File(FILE_PATH_TEXT);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition","attachment; filename=\"file_from_server.log\"");
		return response.build();
 
	}
	
	//http://localhost:8082/01HelloWorld/rest/file/getimage
	@GET
	@Path("/getimage")
	@Produces("image/png")
	public Response getFileImage() {
 
		File file = new File(FILE_PATH_IMG);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=image_from_server.png");
		return response.build();
 
	}
	
	
	//http://localhost:8082/01HelloWorld/rest/file/getpdf
	@GET
	@Path("/getpdf")
	@Produces("application/pdf")
	public Response getFilePDF() {
 
		File file = new File(FILE_PATH_PDF);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=new-android-book.pdf");
		return response.build();
 
	}
	
	//http://localhost:8082/01HelloWorld/rest/file/getxls
	@GET
	@Path("/getxls")
	@Produces("application/vnd.ms-excel")
	public Response getFile() {
 
		File file = new File(FILE_PATH_EXCEL);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=new-excel-file.xls");
		return response.build();
 
	}
}
