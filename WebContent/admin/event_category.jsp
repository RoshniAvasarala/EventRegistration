<%@page import="com.Roshni.Entity.EventCat"%>
<%@page import="com.Roshni.DAO.EventCat_DAO"%>
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
		<h3>Set event type</h3>	
		<div style="color: green">
		<%=
		request.getParameter("status")!=null && request.getParameter("status").equals("success")?"event type added":" "
				
		%>
		
		</div>
		
		
		<form method = "post" action="../event_category_add_controller">
			<div class = "row">
			<div class = "col-sm-6">
				<label>Title</label>
				<input type="text" name = "title" class = "form-control" placeholder = "event">
			</div>
			<div class = "col-sm-6">
				<label style="display: block">&nbsp</label>
				<button class = "btn btn-success">save</button>
			</div>
		
		
		
		</div>
		</form>
	
		<h3>Event type List</h3>
		<table class = "table table-bordered">
			<tr>
				
				<th>ID</th>
				<th>Title</th>
				<th>Status</th>
				<th></th>
				<th></th>
				
			</tr>
		
		
		<%
		List li = new EventCat_DAO(MyConnection.connectTo()).getAll();
		ListIterator lit = li.listIterator();
		while (lit.hasNext()){
			EventCat ec = (EventCat)lit.next();
			                 
			
			%>
			
		<tr>
			
			<td><%= ec.getId() %></td>
			<td><%= ec.getTitle() %></td>
			<td><%= ec.getStatus() %></td>
			<td><a href="" class="btn btn-outline-info" >Update</a>
			<td><a href = "../event_category_delete_controller?id=<%= ec.getId() %>"  class="btn btn-outline-danger">Delete</button></a>
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