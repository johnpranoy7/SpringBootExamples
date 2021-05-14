<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Spring starter project. select spring web. also add tomcat jasper for jsp to servlet conversion</p>
	<p> create a webapp folder in src->main. There we also created pages and removed the suffix in functions. So we have to write that prefix
	and suffix in application.properties. in the controller class we can see methods with either individual url parameters or the entire object in the url. i.e each individual data member must be sent in url but in the function we just need to mention the object. Its that simple </p>
	Index Jsp it is. Hi ${name}
</body>
</html>