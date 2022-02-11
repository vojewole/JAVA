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
<div>
	<h1 style="margin-left:20px;">Save Travels</h1>
	<table  class="table">
	    <thead>
	        <tr>
	            <th>Expense</th>
	            <th>Vendor</th>
	            <th>Amount</th>
	        </tr>
	    </thead>
	    <tbody>
	         <c:forEach var="expenses" items="${expenselist}">
				<tr>
					<td><a href="/expense/<c:out value="${expenses.id}"/>"><c:out value="${expenses.expenseVar}"/></a></td>
					<td><c:out value="${expenses.vendor}"/></td>
					<td><c:out value="${expenses.amount}"/></td>
					<td><a href="/expense/edit/<c:out value="${expenses.id}"/>">edit</a></td>
					<td>
						<form action="/expense/${expenses.id}" method="post">
    						<input type="hidden" name="_method" value="delete">
    						<input type="submit" value="Delete" style="color:white; background-color:red;">
						</form>
					</td>
				</tr>
			</c:forEach>
	    </tbody>
	</table>
</div>
<div style="text-align:center;">
	<h1>Add an expense:</h1>
	<form:form action="/expense/add" method="post" modelAttribute="expense">
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
	    <input type="submit" value="Submit" style="color:white; background-color:blue;"/>
	</form:form>    
</div>
</body>
</html>