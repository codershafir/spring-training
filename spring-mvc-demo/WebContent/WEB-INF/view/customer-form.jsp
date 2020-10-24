<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<title>Customer Form</title>
<style type="text/css">
.errorClass{
color:red
}
</style>
</head>
<body>
<div id="customerFormDiv" align="center">
	<h1>Customer Form</h1>
	<p>The asterisk(*) fields are mandatory.</p>
	<form:form action="confirmDetails" modelAttribute="customerEntity">
		First Name*:	<form:input path="firstName" autocomplete="off"/>
		<form:errors path="firstName" cssClass="errorClass"/>
		<br>
		<br>
		Last Name:	<form:input path="lastName" autocomplete="off"/>
		<br>
		<br>
		Age*:	<form:input path="age" autocomplete="off"/>
		<form:errors path="age" cssClass="errorClass"/>
		<br>
		<br>
		Phone Number:	<form:input path="phoneNumber" autocomplete="off"/>
		<form:errors path="phoneNumber" cssClass="errorClass"/>
		<br>
		<br>
		Business Code:	<form:input path="businessCode" autocomplete="off"/>
		<form:errors path="businessCode" cssClass="errorClass"/>
		<br>
		<br>
		<input type=submit value="Submit">
	</form:form>
</div>
</body>
</html>