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
		<h1>Welcome, <c:out value="${user.name}"/></h1>
		<a href="/logout">logout</a>
	</div>
	<div style="display:flex; justify-content:space-evenly">
		<p>Books from everyone's shelves:</p>
		<a href="/books/new">+ Add a to my shelf!</a>
	</div>
	<div style="display:flex; justify-content:space-evenly; ">
		<table  class="table table-bordered">
		    <thead>
		        <tr>
		        	<th>ID</th>
		            <th>Title</th>
		            <th>Author Name</th>
		            <th>Posted By</th>
		        </tr>
		    </thead>
		    <tbody style="text-align:center;">
		         <c:forEach var="books" items="${books}">
					<tr>
						<td><c:out value="${books.id}"/></td>
						<td><a href="/books/<c:out value="${books.id}"/>"><c:out value="${books.title}"/></a></td>
						<td><c:out value="${books.authorName}"/></td>
						<td><c:out value="${books.user.name}"/></td>
					</tr>
				</c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>