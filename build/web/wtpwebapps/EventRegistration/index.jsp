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
		<img class = "banner-image" src = "images/events/Upcoming-Events-Banner.jpg">
	</div>
	
	<!--Events section  -->
	<div class = "container-fluid">
	<div class = "row">
		<%
			Event_DAO ed = new Event_DAO(MyConnection.connectTo());
			List list = ed.getAll();
			Iterator it2 = list.iterator();
			while(it2.hasNext()){
				Events events = (Events)it2.next();
				%>
				<div class = "col-sm-3">
					<div class = "events_wrapper">
						
						<img onclick="getEventPage('<%= events.getId()%>') "  alt="#" src="images/events/<%=events.getFile_name()!=null?events.getFile_name():"default.png" %>" class = "pimg">
						<div class = "event_title"><%= events.getTitle() %></div>
						<div class = "event_date_time"><%= events.getDate_time() %></div>
						<div class = "event_cost"><%= events.getCost()+"$" %></div>
						
						<div class = "action-wrapper">
						<a class = "btn btn-primary" onclick="Addtocart('<%= events.getId()%>')">Add to cart</a>
						<a class = "btn btn-success" href="#">Register Now!!</a>
						</div>	
									
					
				</div>
				
				
				</div>
				<%
			}
		%>
	
	</div>
	
	</div>
	
	
	
	
	
	<jsp:include page="common/footer.jsp"></jsp:include>
	<script>
		function Addtocart(id){
			
			$.post("addtocart",{
				id: id
			}, function (data,status) {
				$(".stickyEventList").text(data + " Events added");
			});
		}
	</script>
	<div class = "stickyEventList" onclick="window.location.href='cart-items.jsp'">
	
	</div>
	<script>
		function getEventPage(id){
			
			$.post("eventpage",{
				id: id
			}, function (data,status) {
				alert(data);
				window.location.href="event_page.jsp"
			});
		}
	</script>
	
	
</body>
</html>