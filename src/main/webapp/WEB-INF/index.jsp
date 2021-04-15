<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>The Code</title>
</head>
<body>
	<div class="container mt-5 text-center">
		<h1>What is the code?</h1>
		<p class="text-danger">${error}</p>
		<div>
			<form action="/guessCode" method="post">
				<input type="text" name="code">
				<br>
				<input type="submit" class="btn btn-primary mt-3" value="Try Code">
			</form>
		</div>
	</div>
</body>
</html>