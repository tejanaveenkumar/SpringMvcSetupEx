<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Data</h1>
	${eid}<hr />
	${emp}<hr />
	${emp.empId}<hr/>
	${emp.empName}<hr/>
	${emp.empSal}
	<br />
	<c:forEach items="${empsList}" var="emp">
		<c:out value="${emp.empId }"></c:out>
		<c:out value="${emp.empName }"></c:out>
		<c:out value="${emp.empSal }"></c:out>
	
	</c:forEach>
	<h1>WELCOME TO HOME PAGE</h1>
</body>
</html>