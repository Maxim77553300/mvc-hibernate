<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<h2>All Employees</h2>
<br>

<table>
<tr>
<th>Name</th>
<th>Surname</th>
<th>Department</th>
<th>Salary</th>
<th>Operations</th>
<c:forEach var="emp" items="${allEmps}">

<c:url var="updateButton" value="/updateInfo">
<c:param name="empId" value="${emp.id}"/>
</c:url>

<c:url var="deleteButton" value="/deleteEmployee">
<c:param name="empId" value="${emp.id}"/>
</c:url>

<tr>
<td>${emp.name}</td>
<td>${emp.surname}</td>
<td>${emp.department}</td>
<td>${emp.salary}</td>
<td>
<input type="button" value="Update"
onclick = "window.location.href = '${updateButton}' "/>
</td>

<td>
<input type="button" value="Delete"
onclick = "window.location.href = '${deleteButton}' "/>
</td>

</tr>
</c:forEach>



</tr>

</table>

<br>

<input type="button" value="Add"
   onclick="window.location.href= 'addNewEmployee' "/>
</body>

</html>