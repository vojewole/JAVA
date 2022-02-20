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
<h1 style="color:purple;">Book Club</h1>
<p>A place for friends to share thoughts on books.</p>
</div>
<div style="display:flex; justify-content:space-evenly;">
	<div style="text-align:center;">
		<h1>Register:</h1>
		<form:form action="/register" method="post" modelAttribute="newUser">
		    <p>
		        <form:label path="name">Name:</form:label>
		        <form:input path="name"/>
		        <form:errors path="name" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="email">Email:</form:label>
		        <form:input path="email"/>
		        <form:errors path="email" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="password">Password:</form:label>
		        <form:input type="password" path="password"/>
		        <form:errors path="password" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="confirm">Confirm Password:</form:label>
		        <form:input type="password" path="confirm"/>
		        <form:errors path="confirm" class="text-danger"/>
		    </p>
		    <input type="submit" value="Submit" style="color:white; background-color:blue;"/>
		</form:form>    
	</div>
	<div style="text-align:center;">
		<h1>Log in</h1>
		<form:form action="/login" method="post" modelAttribute="newLogin">
			<p style="color:red;"><c:out value="${message}"></c:out></p>
		    <p>
		        <form:label path="email">E-mail:</form:label>
		        <form:input path="email"/>
		        <form:errors path="email" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="password">Password:</form:label>
		        <form:input type="password" path="password"/>
		        <form:errors path="password" class="text-danger"/>
		    </p>
		    <input type="submit" value="Submit" style="color:white; background-color:blue;"/>
		</form:form>    
	</div>
</div>

	

</body>
</html>