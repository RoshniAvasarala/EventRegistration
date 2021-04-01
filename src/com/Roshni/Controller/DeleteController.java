package com.Roshni.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Roshni.DAO.RegisterDAO;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.Entity.Register;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		RegisterDAO rd = new RegisterDAO(MyConnection.connectTo());
		
		if (rd.delete(Integer.parseInt(request.getParameter("id")))) {
			
			response.sendRedirect("admin/index.jsp?status=deleted");
			
			
		}else {
		response.sendRedirect("admin/index.jsp?status=notdeleted");
			
			
			}
	}
}
