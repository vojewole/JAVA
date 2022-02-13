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
	<h1>New Dojo</h1>
	<form:form action="/dojo/new" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:input path="name"/>
	        <form:errors path="name" class="text-danger"/>
	    </p>
	 <input type="submit" value="Create" style="color:white; background-color:blue;"/>
	 </form:form>
	 </div>
</body>
</html>