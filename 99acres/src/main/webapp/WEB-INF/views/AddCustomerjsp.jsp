<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddCustomerJSP</title>
<h1>Add Customer</h1>
<form:form method="post" action="saveitbro">
	<table>
		<tr>
			<td>Customer ID :</td>
			<td><form:input path="customerId" /></td>
		</tr>
		<tr>
			<td>Customer Name :</td>
			<td><form:input path="customerName" /></td>
		</tr>
		<tr>
			<td>Customer Area :</td>
			<td><form:input path="customerArea" /></td>
		</tr>
		<tr>
			<td>Customer Contact No :</td>
			<td><form:input path="customerContactNo" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>
</head>
<body>

</body>
</html>