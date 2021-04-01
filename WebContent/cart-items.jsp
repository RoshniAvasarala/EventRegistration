<%@page import="java.util.ListIterator"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.Roshni.DBConnection.MyConnection"%>
<%@page import="com.Roshni.DAO.Event_DAO"%>
<%@page import="com.Roshni.Entity.Events"%>
<%@page import="com.sun.org.glassfish.gmbal.IncludeSubclass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Registration</title>
<jsp:include page="common/cdn.jsp"></jsp:include>
<link rel = "stylesheet" href="CSS/common.css">
</head>
<body>
	<jsp:include page="common/header.jsp"></jsp:include>
	
	<!-- Banner Section -->
	<div class = "banner">
		<img class = "banner-image" src = "images/events/Wichita_State_University_Header.jpg">
	</div>
	
	<!--Events section  -->
	<div class = "container-fluid">
	<table class = "table table-bordered">
		<thead>
			<tr>
				<th></th>
				<th>ID</th>
				<th>Image</th>
				<th>Event Title</th>
				<th>Cost</th>
				
				
			</tr>
		</thead>
	<%
	if(session.getAttribute("addToCart")!=null){
		List li = (List)session.getAttribute("addToCart");
		ListIterator lit = li.listIterator();
		Event_DAO ed = new Event_DAO(MyConnection.connectTo());
		int a =0;
		float total=0;
		while(lit.hasNext()){
			a++;
			int id =Integer.parseInt((String)lit.next());
			Events e = ed.findById(id);
			total+= e.getCost();
			%>
			<tr>
				<td><%= a %></td>
				<td><%= e.getId() %></td>
				<td><img src = "images/events/<%=e.getFile_name()%>" height="70" width="70"></td>
				<td><%= e.getTitle() %></td>
				<td><%=e.getCost() %></td>
			
				
			</tr>
			<%
		}
		%>
		<tr>
		<td colspan="4"><strong>Total:</strong></td>
		<td><%= total %></td>
		</tr>
		<tr>
		<td colspan="5" style="text-align: center;"><button type = "submit" class = "btn btn-success btn-lg">Register</button></td>
		
		</tr>
		
		<%
	}
	%>
	</table>
	
	</div>
	
	
	
	
	
	<jsp:include page="common/footer.jsp"></jsp:include>
	
</body>
</html>