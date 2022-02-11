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
			<h1 style="color:blue;">Expense Details</h1>
			<a href="/expense">Go Back</a>
		</div>
	<h2 style="margin-left:20px;">Expense Name: <c:out value="${expense.expenseVar}"/></h2>
	<h2 style="margin-left:20px;">Expense Description: <c:out value="${expense.description}"/></h2>
	<h2 style="margin-left:20px;">Vendor: <c:out value="${expense.vendor}"/></h2>
	<h2 style="margin-left:20px;">Amount Spent: <c:out value="${expense.amount}"/></h2>
</body>
</html>