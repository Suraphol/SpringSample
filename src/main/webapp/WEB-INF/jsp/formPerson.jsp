<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Person</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/files/css/css_0.css "/>
</head>
<body>
 <h4>Submit your information</h4>
 <hr/>
 <form:form action="detailPerson" modelAttribute="info">
 	FirstName: <form:input path="firstName"/><p/>
 	LastName: <form:input path="lastName"/><p/>
 	Gender: <%-- <form:radiobutton path="gender" value="Male"/>Male
 	<form:radiobutton path="gender" value="Female"/>Female  --%>
 	<form:radiobuttons path="gender" items="${genders }"/><p/>
 	Country: <form:select path="country">
 		<%-- <form:option value="India">India</form:option>
 		<form:option value="Japan">Japan</form:option>
 		<form:option value="USA">USA</form:option> --%>
 		<form:options items="${countrys }"/>
 	</form:select><p/>
 VisitedCountry:	<%-- <form:checkbox path="visitedCountry" value="China"/>China
 	<form:checkbox path="visitedCountry" value="Thailand"/>Thailand
 	<form:checkbox path="visitedCountry" value="Sweden"/>Sweden
 	<form:checkbox path="visitedCountry" value="Japan"/>Japan --%>
 	<form:checkboxes items="${visitedCountrys}" path="visitedCountry"/>
 	<p/>
 	Message:<form:textarea path="message"/>
 
 	<p/>
 	<input type="submit" value="Submit">
 
 </form:form>
</body>
</html>