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
	<h1 style="text-align:center;">Send an Omikuji</h1>
    <form action='/omikuji/send' method='post' style="text-align:center; border: solid 2px black; width: 500px; margin-left:700px;">
    	<div style="margin:20px;">
    		<label>Pick any number from 5 to 25</label>
    		<input type="number" name='numbers'>
    	</div>
		<div style="margin:20px;">
			<label>Enter the name of any city.</label>
    		<input type='text' name='city'>
		</div>
		<div style="margin:20px;">
			<label>Enter the name of any real person.</label>
    		<input type='text' name='person'>
		</div>
		<div style="margin:20px;">
			<label>Enter professional endeavor or hobby.</label>
    		<input type='text' name='hobby'>
		</div>
		<div style="margin:20px;">
			<label>Enter any type of living thing.</label>
    		<input type='text' name='thing'>
		</div>
		<div style="margin:20px;">
			<label>Say something nice to someone.</label>
    		<input type='text' name='nice'>
		</div>
    	<div style="margin:20px;">
    		<label>Send and show a friend</label>
    		<input type='submit' value='Send'>
    	</div>
    </form>
</body>
</html>