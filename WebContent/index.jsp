<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello SpringMVC</title>
</head>
<body>
	<form action="requestmapping" method="post">
		<input type="submit" value="submit" />
	</form>
	<br><br>
	<a href="/HelloSpringMVC/testvariable/18">testPathVariable</a>
	
	
	<br><br>
	<a href="/HelloSpringMVC/testRestGet/1">request get</a>
	<br><br>
	<form action="testRestPost" method="post">
		<input type="submit" value="POST" />
	</form>
	<br><br>
	<form action="testRestDelete/1">
		<input type="hidden" name="_method" value="DELETE" />
		<input type="submit" value="DELETE" />
	</form>
	<br><br>
	<form action="testRestPut/1" methmod="post">
		<input type="hidden" name="_method" value="PUT" />
		<input type="submit" value="PUT">
	</form>
</body>
</html>