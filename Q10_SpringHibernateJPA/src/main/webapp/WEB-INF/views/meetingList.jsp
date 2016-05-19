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
    <title>Meeting List</title>
   
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
           		<div align="left"><b>Meeting List</b> </div>
                <div align="right"><a href="newMeeting">Create Meeting</a></div>
                <div align="right"><a href="/">Return Home Page</a></div>
        </div>
        <div class="panel-body">
            <c:if test="${empty meetingList}">
                No Record.
            </c:if>
            <c:if test="${not empty meetingList}">   
            
                        	
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #F2F5A9;">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Department</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${meetingList}" var="m">
                        <tr>
                        	<th><c:out value="${m.meetId}"/></th>
                        	<th><c:out value="${m.meetName}"/></th>
                        	<th><c:out value="${m.meetDescription}"/></th>
                       	    <th><c:out value="${m.department}"/></th>
                        	<th><a href="editMeeting?id=<c:out value='${m.meetId}'/>">Edit</a></th>
                        	<th><a href="removeMeeting?id=<c:out value='${m.meetId}'/>">Delete</a></th>                         	
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