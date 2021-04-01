package com.Roshni.Controller.event_category;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Roshni.DAO.EventCat_DAO;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.Entity.EventCat;

/**
 * Servlet implementation class Event_category_add_controller
 */
@WebServlet("/event_category_add_controller")
public class Event_category_add_controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EventCat ec = new EventCat();
		EventCat_DAO ecd = new EventCat_DAO(MyConnection.connectTo());
		if(request.getParameter("title") != null && !request.getParameter("title").equals(" ")) {
		ec.setTitle(request.getParameter("title"));
		boolean b = ecd.insert(ec);
		if(b=true) {
			response.sendRedirect("admin/event_category.jsp?status=success");
		}
		
		}
	}

}
