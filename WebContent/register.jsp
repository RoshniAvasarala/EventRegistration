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
	<div class = "container register">
	<h1>Register</h1>
	<form method = "post" action = "RegisterServlet">
		<div class = "row">
			<div class = "col-sm-6">
				<label>Name:</label>
				<input type = "text" class = "form-control" name = "name" required>
			</div>
			<div class = "col-sm-6">
				<label>Student-id:</label>
				<input type = "text" class = "form-control" name = "student_id" required>
			</div>
			<div class = "col-sm-6">
				<label>Email id</label>
				<input type = "text" class = "form-control" name = "emailid" required>
			</div>
			<div class = "col-sm-6">
				<label>Password</label>
				<input type = "password" class = "form-control" name = "password" required>
			</div>
		</div>
		<div class = "row">
			<div class = "col-sm-12">
				<button type = "submit" class = "btn btn-success">Submit</button>
				<a href="login.jsp">Already Registered?</a>
			</div>
		</div>
	</form>
	</div>
	<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>