 
<%@page import="com.Roshni.Entity.Register" %>
 <% 
 if(session.getAttribute("rg")!= null){
	  Register rg = (Register)session.getAttribute("rg");
	 
 }else{
	 response.sendRedirect("../login.jsp");
 }
	  %>