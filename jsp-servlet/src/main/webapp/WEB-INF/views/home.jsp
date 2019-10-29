<%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
	.mt{
		margin-top:100px;
	}
</style>
</head>
<body>
	<h1 class="mt-100">Danh sach account</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Username</th>
				<th scope="col">Password</th>
				<th scope="col">Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var='account' items="${accounts}">
				<tr>
					<th scope="row">${account.id}</th>
					<td>${account.username}</td>
					<td>${account.password}</td>
					<td>${account.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>