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
<h1 style="margin-left:20px;"><c:out value="${books.title}"/></h1>
<body>
<h2 style="margin-left:20px;">Description: <c:out value="${books.description}"/></h2>
<h2 style="margin-left:20px;">Language: <c:out value="${books.language}"/></h2>
<h2 style="margin-left:20px;">Number of Pages: <c:out value="${books.numberOfPages}"/></h2>
</body>
</html>