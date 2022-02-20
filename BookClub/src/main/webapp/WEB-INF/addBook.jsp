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
	<div style="display:flex; justify-content:space-evenly">
		<h1>Add a Book to Your Shelf!</h1>
		<a href="/books">back to the shelves</a>
	</div>
	<div style="text-align:center;">
		<form:form action="/books/add" method="post" modelAttribute="book">
		    <p>
		        <form:label path="title">Title</form:label>
		        <form:input path="title"/>
		        <form:errors path="title" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="authorName">Author</form:label>
		        <form:input path="authorName"/>
		        <form:errors path="authorName" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="thoughts">My thoughts</form:label>
		        <form:input path="thoughts"/>
		        <form:errors path="thoughts" class="text-danger"/>
		    </p>
		    <input type="submit" value="Submit" style="color:white; background-color:blue;"/>
		</form:form>    
	</div>
</body>
</html>