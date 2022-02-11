<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
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
		<h1 style="color:green;">Edit Expense</h1>
		<a href="/expense">Go Back</a>
	</div>
	<div style="text-align:center;">
		<form:form action="/expense/${expense.id}" method="post" modelAttribute="expense">
		    <input type="hidden" name="_method" value="put">
		     <p>
		        <form:label path="expenseVar">Expense Name:</form:label>
		        <form:input path="expenseVar"/>
		        <form:errors path="expenseVar" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="vendor">Vendor:</form:label>
		        <form:input path="vendor"/>
		        <form:errors path="vendor" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="amount">Amount:</form:label>
		        <form:input path="amount"/>
		        <form:errors path="amount" class="text-danger"/>
		    </p>
		    <p>
		        <form:label path="description">Description:</form:label>
		        <form:input path="description"/>
		        <form:errors path="description" class="text-danger"/>
		    </p>   
		    <input type="submit" value="Submit" style="color:white; background-color:green;"/>
		</form:form>
	
	</div>
	

</body>
</html>