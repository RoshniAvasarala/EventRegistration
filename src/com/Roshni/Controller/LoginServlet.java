package com.Roshni.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Roshni.DAO.RegisterDAO;
import com.Roshni.DBConnection.BCrypt;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.Entity.Register;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] errors = new String[2];
		Register r = new Register();
		RegisterDAO rd = new RegisterDAO(MyConnection.connectTo());
		PrintWriter out = response.getWriter();
		if(request.getParameter("student_id").equals("") || request.getParameter("student_id").equals(" ")) {
			errors[0] = "Invalid ID field";
		}else {
			
			r.setStudent_id(request.getParameter("student_id"));
		}
		if(request.getParameter("password").equals("") || request.getParameter("password").equals(" ")) {
			
			
			errors[1] = "Invalid password field";
		}else {
			
			r.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt(12)));
		}
		Register register = rd.login(r);
		
		if(register!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("rg",register );
			if(register.getRole().equals("admin")) {
				response.sendRedirect("admin/index.jsp");
			}else if(register.getRole().equals("user")) {
				response.sendRedirect("index.jsp");
			}
		}else {
			response.sendRedirect("login.jsp?info=failed");
		}
		System.err.println(""+errors[0]+""+errors[1]);
		
	}
	
	
	

}
