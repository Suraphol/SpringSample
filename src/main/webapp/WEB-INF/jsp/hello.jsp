<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Hello ${name }</h1>
	${param.name }
	<p/>
	${dateNow }
	<p/><hr/>
	<ul>
		<c:forEach items="${courses }" var="temp">
			<li>${temp }</li>
		</c:forEach>
	</ul>
</body>
</html>