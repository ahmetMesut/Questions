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
    <title>Employee List</title>
   
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>    
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
    
    
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-warning">
        <div class="panel-heading">
           		<div align="left"><b>Employee List</b> </div>
                <div align="right"><a href="newEmployee">Create Employee</a></div>
                <div align="right"><a href="/">Return Home Page</a></div>
        </div>
        <div class="panel-body">
            <c:if test="${empty employeeList}">
                No Record.
            </c:if>
            <c:if test="${not empty employeeList}">   
            
                        	
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #F2F5A9;">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Surname</th>
                        <th>Salary</th>
                   
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${employeeList}" var="e">
                        <tr>
                        	<th><c:out value="${e.empId}"/></th>
                        	<th><c:out value="${e.empName}"/></th>
                        	<th><c:out value="${e.empSurname}"/></th>
                        	<th><c:out value="${e.empSalary}"/></th>
                      
                        	<th><a href="editEmployee?id=<c:out value='${e.empId}'/>">Edit</a></th>
                        	<th><a href="removeEmployee?id=<c:out value='${e.empId}'/>">Delete</a></th>                         	
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
 </div>   
   

</body>
</html>