<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<style>
table#nat {
	width: 50%;
	background-color: cyan;
}
</style>
</head>
<body>
	<%
		String name = (String) session.getAttribute("sessionName");
	%>
	<form action="RegistrationController2" method="post">
	<table id="nat">
		<tr>
			<td>First Name</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lastName" /></td>
		</tr>

	</table>
	<input type="submit" value="Next" />
	</form>
</body>
</html>