<%@page import="com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference.Elements"%>
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
		<img class = "banner-image" src = "images/events/Upcoming-Events-Banner.jpg">
	</div>
	
	<!--Events section  -->
	<div class = "container-fluid">
	
	<%
	
		
		int id = (Integer)(session.getAttribute("event_page"))  ;
		Event_DAO ed = new Event_DAO(MyConnection.connectTo());
		Events events = ed.findById(id);
		
			
	%>
	<div class = "wrapper">
		<div class = "grid_container">
			
				
					<div class = "content-top grid_container">
						<div class = "box_image grid_4">
							<img alt="#" src="images/events/<%=events.getFile_name()%>" class = "event_img">
						</div>
						<div class = "box_content vevent grid_8">
							<h1 class = "title"><%=events.getTitle()%></h1>
							<div class = "description"><%=events.getDescription()%></div>
							<p class = "date_time"><abbr title = <%=events.getDate_time()%>><%=events.getDate_time()%></abbr></p>
							<p class = "cost"><%=events.getCost()%>$</p>
						</div>
						
	
					</div>
				
				</div>
	
			
	
		
	
	</div>
		
	
	</div>
	
	
	
	
	
	<jsp:include page="common/footer.jsp"></jsp:include>
	
</body>
</html>