<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Department Info</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	
	<style type="text/css">
	.myrow-container {
		margin-top: 20px;
	}
	</style>
</head>
<body class=".container-fluid">
	<div class="container myrow-container">
		<div class="panel panel-warning">
			<div class="panel-heading">
				<h3 class="panel-title">Department Info</h3>
				 <div align="right"><a href="listAllDepartment">Department List</a></div>
				 <div align="right"><a href="/">Return Home Page</a></div>
			</div>
			<div class="panel-body">
				<form:form id="departmentRegisterForm" cssClass="form-horizontal"
					modelAttribute="department" method="post" action="saveDepartment">
				
				   <form:hidden path="depId" value="${departmentObject.depId}" />

					<div class="form-group">
						<div class="control-label col-xs-3">
							<form:label path="depName">Department Name</form:label>
						</div>
						<div class="col-xs-6">
							<form:input cssClass="form-control" path="depName" value="${departmentObject.depName}" />
						</div>
					</div>


					<div class="form-group">
						<div class="control-label col-xs-3">
							<form:label path="depDescription">Description</form:label>
						</div>
						<div class="col-xs-6">
							<form:input cssClass="form-control" path="depDescription" value="${departmentObject.depDescription}" />
						</div>
					</div>

					<div class="form-group">
						<div class="control-label col-xs-3">
							<form:label path="employee">Employee</form:label>
						</div>
						<div class="col-xs-6">
						<table>
							<tr><form:select path="employee" items="${employeeNames}" /></tr>
						</table>
						</div>
					</div>
					<div class="form-group">
						<div class="row">
							<div class="col-xs-4"></div>
							<div class="col-xs-4">
								<input type="submit" id="saveDepartment" class="btn btn-primary"
									value="Submit" />
							</div>
							<div class="col-xs-4"></div>
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>


</body>
</html>