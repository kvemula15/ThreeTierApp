<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Edit Employee Form</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Edit Employee Form</h2>
 
	<form:form method="POST" modelAttribute="employee">
	
		<table>
		<c:forEach items="${employee}" var="emp">
			<tr>
				<td><label for="name">Name: </label> </td>
				<td><form:input path="name" id="name" value="${emp.name}"/></td>
				<td><form:errors path="name" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="joiningDate">Joining Date: </label> </td>
				<td><form:input path="joiningDate" id="joiningDate" value="${emp.joiningDate}"/></td>
				<td><form:errors path="joiningDate" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="salary">Salary: </label> </td>
				<td><form:input path="salary" id="salary" value="${emp.salary}"/></td>
				<td><form:errors path="salary" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="ssn">SSN: </label> </td>
				<td><form:input path="ssn" id="ssn" value="${emp.ssn}"/></td>
				<td><form:errors path="ssn" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td colspan="3"><input type="submit" value="Register"/></td>
			</tr>
			</c:forEach>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/list' />">List of All Employees</a>
</body>
</html>