<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>

		<h1>JAX-RS @FormQuery</h1>
	
		<form action="rest/json/metallica/post" method="post" enctype="application/json">
			<p>
				Name : <input type="text" name="singer" />
			</p>
			<p>
				Age : <input type="text" name="title" />
			</p>
			<input type="submit" value="Add User" />
		</form>

</body>
	
</html>