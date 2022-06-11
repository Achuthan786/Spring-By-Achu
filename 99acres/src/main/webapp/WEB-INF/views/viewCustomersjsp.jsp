<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Customers List</h1>
<table border="2" width="70%" cellpadding="12">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Area</th>
		<th>Ph no</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.customerId}</td>
			<td>${emp.customerName}</td>
			<td>${emp.customerArea}</td>
			<td>${emp.customerContactNo}</td>
			<td><a href="editItMan/${emp.customerId}">Edit</a></td>
			<td><a href="deletetemp/${emp.customerId}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
