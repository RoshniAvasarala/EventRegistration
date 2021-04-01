package com.Roshni.Controller.event_category;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Roshni.DAO.EventCat_DAO;
import com.Roshni.DBConnection.MyConnection;

/**
 * Servlet implementation class Event_category_delete_controller
 */
@WebServlet("/event_category_delete_controller")
public class Event_category_delete_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EventCat_DAO ecd = new EventCat_DAO(MyConnection.connectTo());
if (ecd.delete(Integer.parseInt(request.getParameter("id")))) {
			
			response.sendRedirect("admin/event_category.jsp?status=deleted");
			
			
		}else {
		response.sendRedirect("admin/event_category.jsp?status=notdeleted");
			
			
			}
	}

}
