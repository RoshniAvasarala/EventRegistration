<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="../login-check.jsp" %>

<%@page import="com.Roshni.Entity.Register"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="com.Roshni.DBConnection.MyConnection"%>
<%@page import="com.Roshni.DAO.RegisterDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin portal</title>
<jsp:include page="common/cdn.jsp"></jsp:include>
<link  href="common/common.css" rel = "stylesheet" type = "text/css">
</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>
<div class = "containerfluid">
	
	<div class = "row">
		<div class = "col-sm-3 sidebar-col">
		<%@include file="common/sidebar.jsp" %>
		</div>
		<div class = "col-sm-9 main-col">
		<h3>Students list</h3>	
		<% 
	if(request.getParameter("status")!=null){ 
		out.print("<h5>Deleted<h5>");
	}
	%>
		
		<table class = "table table-bordered">
			<tr>
				
				<th>ID</th>
				<th>Name</th>
				<th>Student-ID</th>
				<th>Email-ID</th>
				<th>Role</th>
				<th></th>
				<th></th>
				
			</tr>
		
		
		<%
		List li = new RegisterDAO(MyConnection.connectTo()).getAll();
		ListIterator lit = li.listIterator();
		while (lit.hasNext()){
			Register rb = (Register)lit.next();
			                 
			
			%>
			
		<tr>
			
			<td><%= rb.getId() %></td>
			<td><%= rb.getName() %></td>
			<td><%= rb.getStudent_id() %></td>
			<td><%= rb.getEmailid() %></td>
			<td><%= rb.getRole() %></td>
			<td><a href="" class="btn btn-outline-info" >Update</a>
			<td><a href = "../DeleteController?id=<%= rb.getId() %>"  class="btn btn-outline-danger">Delete</button></a>
		</tr>
		
		<%
		
		}
		
		%>
		
		</table>
		
		</div>
	</div>
</div>
</body>
</html>