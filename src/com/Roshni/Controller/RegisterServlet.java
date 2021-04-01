package com.Roshni.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Roshni.DAO.RegisterDAO;
import com.Roshni.DBConnection.BCrypt;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.Entity.Register;

/**
 * Servlet implementation class Register
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] errors = new String[4];
		Register r = new Register();
		PrintWriter out = response.getWriter();
		if(request.getParameter("name").equals("") || request.getParameter("name").equals(" ")) {
			
			errors[0] = "Invalid Name field";
		}else {
			
			r.setName(request.getParameter("name"));
		}
		if(request.getParameter("student_id").equals("") || request.getParameter("student_id").equals(" ")) {
			errors[1] = "Invalid ID field";
		}else {
			
			r.setStudent_id(request.getParameter("student_id"));
		}
		if(request.getParameter("emailid").equals("") || request.getParameter("emailid").equals(" ")) {
			errors[2] = "Invalid email field";	
		}else {
			r.setEmailid(""+request.getParameter("emailid"));
			
			
		}
		if(request.getParameter("password").equals("") || request.getParameter("password").equals(" ")) {
			
			
			errors[3] = "Invalid password field";
		}else {
			
			r.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt(12)));
		}
			
		RegisterDAO rd = new RegisterDAO(MyConnection.connectTo());
		boolean bool = rd.insert(r);
		if(bool) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("register.jsp?info = failed");
		}
	}
	 
	

}
