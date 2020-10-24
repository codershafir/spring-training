<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Page</title>
</head>
<body>
<div id="studentFormDiv" align="center">
	<h1>Student Registration Form</h1>
	<form:form action="confirmDetails" modelAttribute="studentEntity">
		First Name:	<form:input path="firstName" autocomplete="off"/>
		<br>
		<br>
		Last Name:	<form:input path="lastName" autocomplete="off"/>
		<br>
		<br>
		Country Name:	<form:select path="countryName">
							<form:options items="${studentEntity.countryOptions}"/>
						</form:select>
		<br>
		<br>
		Gender:	<form:radiobuttons path="gender" items="${studentEntity.genderOptions}"/>
		<br>
		<br>
		Subjects: <form:checkboxes path="subjectList" items="${studentEntity.subjectOptions}"/>
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</div>
</body>
</html>