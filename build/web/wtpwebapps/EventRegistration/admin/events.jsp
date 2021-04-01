<%@page import="java.util.Iterator"%>
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
		<h3>Event Manager</h3>	
		<div style="color: green">
		<%=
		request.getParameter("status")!=null && request.getParameter("status").equals("success")?"Event Scheduled":" "
				
		%>
		
		</div>
		
		<form method = "post" action="../eventadd_controller" enctype="multipart/form-data">
		<div class = "row">
			<div class = "col-sm-6">
				<label>Title</label>
				<input type="text" name = "title" class = "form-control" placeholder = "event">
			</div>
			<div class = "col-sm-6">
				<label>Cost</label>
				<input type="text" name = "cost" class = "form-control" placeholder = "0.00$">
			</div>
		</div>
		<div class = "row">
			<div class = "col-sm-6">
				<label>Select events category</label>	
				<select name = "event_category_id" class = "form-control">
				<%
				EventCat_DAO ecd = new EventCat_DAO(MyConnection.connectTo());
				         List li = ecd.getAll();
				         Iterator lit = li.iterator();
				         while (lit.hasNext()){
				 			EventCat ec = (EventCat)lit.next();
				 			%>
				 			<option value = "<%= ec.getId()%>"><%= ec.getTitle() %></option>
				 			<%
				         }
				%>
				
				</select>			
			</div>
			<div class = "col-sm-6">
				<label>Date</label>
				<input type="text" name = "date_time"  id = "input"  class = "form-control" placeholder = "mm/yy/dd">
				<script type="text/javascript">
				$('#input').datetimepicker({
					uiLibrary:'bootstrap',
					footer:true
						
					
				});
				
				</script>
			</div>
						
		</div>
		<br>
		<div class = "row">
					<div class = "col-sm-12">						
						<label>Description</label>
						<textarea type = "text" id="description" name = "description" class = "form-control"></textarea>
					</div>
					<script src="https://cdn.ckeditor.com/4.16.0/standard/ckeditor.js"></script>
					<script>
                        CKEDITOR.replace( 'description' );
                </script>
				</div>
		
		<div class = "row">
			<div class = "col-sm-6">
				<input type = "file" name = "uploadFile"  class = "form-control">
				
			</div>
			
			<div class = "col-sm-6">
				<label style="display: block">&nbsp</label>
				<button class = "btn btn-success">save</button>
			</div>
		</div>
		
				
		
		</form>
		</div>
	</div>
</div>

</body>


</html>