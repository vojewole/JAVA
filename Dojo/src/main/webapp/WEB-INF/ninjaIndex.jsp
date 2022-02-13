<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
    <title></title>
    <!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>    
</head>
<body>
	<div style="text-align:center;">
		<h1>New Ninja</h1>
		<form:form action="/ninja" method="post" modelAttribute="ninja">
			<p>
		      <form:select path="dojo">
		        <c:forEach var="dojos" items="${dojoList}">
		            <form:option value="${dojos.id}" path="dojo">
		                <c:out value="${dojos.name}"/>
		            </form:option>
		        </c:forEach>
    		</form:select>
		    </p>
		    <p>
		        <form:label path="firstName">First Name:</form:label>
		        <form:input path="firstName"/>
		        <form:errors path="firstName" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="lastName">Last Name:</form:label>
		        <form:input path="lastName"/>
		        <form:errors path="lastName" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="age">Age:</form:label>
		        <form:input path="age"/>
		        <form:errors path="age" class="text-danger"/>
		    </p>
		 <input type="submit" value="Create" style="color:white; background-color:blue;"/>
		 </form:form>
	 </div>
</body>
</html>