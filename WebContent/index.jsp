<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello SpringMVC</title>
</head>
<body>

	<a href="/HelloSpringMVC/testModelAadView">TestModelAadView</a>
	<br><br>
	<a href="/HelloSpringMVC/testSessionAttributes">TestSessionAttributes</a>
	<br><br>
	<form action="/HelloSpringMVC/testModelAttribute" method="post">
		username:<input type="text" name="username" value="jim" />
		passworld:<input type="password" name="passworld" value="123456" />
		email:<input type="text" name="email" value="jim@163.com" />
		<input type="submit" value="submit" />
	</form>
</body>
</html>