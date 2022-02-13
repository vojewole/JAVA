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
	<h1 style="margin-left:20px;"><c:out value ="${dojoName.name}"></c:out><span> </span>Location Ninjas</h1>
	<table  class="table">
	    <thead>
	        <tr>
	            <th>First Name</th>
	            <th>Last Name</th>
	            <th>Age</th>
	        </tr>
	    </thead>
	    <tbody>
	         <c:forEach var="dojo" items="${dojos}">
				<tr>
					<td><c:out value="${dojo.firstName}"/></td>
					<td><c:out value="${dojo.lastName}"/></td>
					<td><c:out value="${dojo.age}"/></td>
				</tr>
			</c:forEach>
	    </tbody>
	</table>
</body>
</html>