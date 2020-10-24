<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
<title>Customer Confirmation Page</title>
</head>
<body>
	<h1>The entered Customer name is ${customerEntity.firstName} ${customerEntity.lastName}</h1>
	<br>
	<h1>The Customer age is ${customerEntity.age}</h1>
	<br>
	<h1>The Phone number is ${customerEntity.phoneNumber}</h1>
	<br>
	<h1>The Business code is ${customerEntity.businessCode}</h1>
	<br>
</body>
</html>