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
<h1 style="margin-left:20px;">All Books</h1>
<table  class="table">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="books" items="${booklist}">
			<tr>
				<td><c:out value="${books.id}"/></td>
				<td><a href="/books/${books.id}"> <c:out value="${books.title}"/></a></td>
				<td><c:out value="${books.description}"/></td>
				<td><c:out value="${books.language}"/></td>
				<td><c:out value="${books.numberOfPages}"/></td>
			</tr>
		</c:forEach>
    </tbody>
</table>
	
</body>
</html>