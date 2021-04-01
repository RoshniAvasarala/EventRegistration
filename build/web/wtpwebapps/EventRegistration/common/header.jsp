<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.Roshni.DBConnection.MyConnection"%>
<%@page import="com.Roshni.DAO.EventCat_DAO"%>
<%@page import="com.Roshni.Entity.EventCat"%>
<%@page import="com.Roshni.Entity.Register"%>
<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">Event Registration</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      <li class="nav-item dropdown">
      	 
        <a class="nav-link dropdown-toggle" href="events.jsp" id = "navbardrop" data-toggle = "dropdown">Events</a>
        <div class = "dropdown-menu">
        <%
        EventCat_DAO ecd = new EventCat_DAO(MyConnection.connectTo());
        List li  = ecd.getAll();
        Iterator it = li.iterator();
        while(it.hasNext()){
        	EventCat ec = (EventCat)it.next();
        %>
        <a class = "dropdown-item" href = "events.jsp?id=<%= ec.getId()%>"><%= ec.getTitle() %> </a>
        
        <%
        }
        
        	
        
        %>
        
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Contact.jsp">Contact</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="register.jsp">Register</a>
      </li> 
      <li class="nav-item dropdown">
      <% if(session.getAttribute("rg")!= null){
    	  Register rg = (Register)session.getAttribute("rg");
    	  %>
    	  <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        <%= rg.getName() %>
      	</a>
      	<div class="dropdown-menu">
    	  <%
    	  if(rg.getRole().equals("admin")){
    		%>
    		<a class="dropdown-item" href="admin/index.jsp">Dashboard</a>
       	 <a class="dropdown-item" href="logout">Logout</a>
    		<%  
    		  
    	  }else if(rg.getRole().equals("user")){
    		  %>
      		<a class="dropdown-item" href="user/index.jsp">Dashboard</a>
         	 <a class="dropdown-item" href="logout">Logout</a>
      		<%  
    	  }
    	 
    	  }
      else{
		  %>
		  <a class="nav-link" href="login.jsp">Login</a>
		  <% 
      }
    	  
    	  %>
        
      </li>    
    </ul>
  </div>  
</nav>