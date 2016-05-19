<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>Home Page</title>
</head>
<body>
	<div class="container">
		<h2>Home Page</h2>
		
		<div class="alert alert-success">
			Employee <br> <a href="newEmployee">Add</a> | <a href="listAllEmployee">List</a>
		</div>

		<div class="alert alert-success">
			Department <br> <a href="newDepartment">Add</a> | <a href="listAllDepartment">List</a>

		</div>
		<div class="alert alert-success">
			Meeting <br> <a href="newMeeting">Add</a> | <a href="listAllMeeting">List</a>
		</div>	
	</div>

</body>
</html>