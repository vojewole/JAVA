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
	<h1 style="text-align:center;">New Book</h1>
	<form:form action="/books" method="post" modelAttribute="book">
	    <p>
	        <form:label path="title">Title</form:label>
	        <form:errors path="title" class="text-danger"/>
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description" class="text-danger"/>
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="language">Language</form:label>
	        <form:errors path="language" class="text-danger"/>
	        <form:input path="language"/>
	    </p>
	    <p>
	        <form:label path="numberOfPages">Pages</form:label>
	        <form:errors path="numberOfPages" class="text-danger"/>     
	        <form:input type="number" path="numberOfPages"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>