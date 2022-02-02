<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaguides.net</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<%@ page isELIgnored="false"%>
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>

<h2>Employee Info</h2>

<form:form action="saveEmployee" modelAttribute="employee">

          <form:hidden path="id"/>

          Name <form:input path="name"/>
          <br><br>
          Surname <form:input path="surname"/>
          <br><br>
          Department <form:input path="department"/>
          <br><br>
          Salary <form:input path="salary"/>
          <br><br>
          <input type="submit" value="OK">

</form:form>

</body>

</html>