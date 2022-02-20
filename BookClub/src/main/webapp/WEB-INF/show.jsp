<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<h1><c:out value="${books.title}"></c:out></h1>
			<a href="/books">back to the shelves</a>
	</div>
	<div>
		<p><span style="color:red;"><c:out value="${books.user.name}"/></span> read <span style="color:purple;"><c:out value="${books.title}"/></span> by <span style="color:green;"><c:out value="${books.authorName}"/></span> </p>
		<p>Here are <span style="color:red;"><c:out value="${books.user.name}"/></span> thoughts:</p>
		<p><c:out value="${books.thoughts}"/></p>
	</div>
</body>
</html>