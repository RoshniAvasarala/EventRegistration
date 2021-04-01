<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<jsp:include page="common/cdn.jsp"></jsp:include>
<link rel = "stylesheet" href="CSS/common.css">
</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>
	<div class = "container register">
	<h1>Login</h1>
	<% 
	if(request.getParameter("info")!=null){ 
		out.print("<h1>Login Failed<h1>");
	}
	%>
	<form method = "post" action = "LoginServlet">
		<div class = "row">
			
			<div class = "col-sm-12">
				<label>Student-id:</label>
				<input type = "text" class = "form-control" placeholder = "Enter your id" name = "student_id" required>
			</div>
			
			<div class = "col-sm-12">
				<label>Password</label>
				<input type = "password" class = "form-control" placeholder = "Enter password" name = "password" required>
			</div>
		</div>
		<div class = "row">
			<div class = "col-sm-12">
				<button type = "submit" class = "btn btn-success">Submit</button>
				<a href="register.jsp">Not a member? Register</a>
			</div>
		</div>
	</form>
	</div>
	<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>