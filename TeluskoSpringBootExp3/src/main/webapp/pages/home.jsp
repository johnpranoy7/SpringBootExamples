<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Save Alien</p>
	<form action="alien" method="post">
		<input type="text" name="sid">
		<input type="text" name="sname">
		<input type="text" name="tech">
		<button type="submit">Submit</button>
	</form>
	<p>Search Alien</p>
	<form action="alien">
		<input type="text" name="sid">
		<button type="submit">Search</button>
	</form>
</body>
</html>