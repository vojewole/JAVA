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
	<h1 style="text-align:center;">Here's Your Omikuji!</h1>
	<div style="margin-right:20px; margin-top:20px; margin-bottom:20px; margin-left:700px;background-color:DodgerBlue; text-align:center; width:500px; border: solid 2px black">
		<p>In <span> <c:out value="${numbers}"/></span> years you will</p>
		<p>live in <span> <c:out value="${city}"/></span> with</p>
		<p><span> <c:out value="${person}"/></span> as your</p>
		<p>roommate, <span> <c:out value="${hobby}"/></span> for a living.</p>
		<p>The next time you </p>
		<p>see a <span> <c:out value="${thing}"/></span> you will</p>
		<p>have good luck.</p>
		<p>Also, <span> <c:out value="${nice}"/></span>.</p>
	</div>
	<div style=" text-align:center;">
		<a href="/omikuji">Go Back</a>
	</div>
</body>
</html>