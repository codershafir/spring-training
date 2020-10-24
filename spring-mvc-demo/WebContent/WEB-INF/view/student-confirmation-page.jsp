<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>
	<h1>The entered Student name is ${studentEntity.firstName} ${studentEntity.lastName}</h1>
	<br>
	<h1>The Country name is ${studentEntity.countryName}</h1>
	<br>
	<h1>The student is a ${studentEntity.gender}</h1>
	<br>
	<h1>The students favorite subjects are:</h1>
	<ul>
	<c:forEach var="subject" items="${studentEntity.subjectList}">
    	<li>${subject}</li>
    </c:forEach>
	</ul>
</body>
</html>