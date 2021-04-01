package com.Roshni.Controller.event_category;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Roshni.Entity.Events;

/**
 * Servlet implementation class EventPage_Controller
 */
@WebServlet("/eventpage")
public class EventPage_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int id=0;
		String param = request.getParameter("id");
				id = Integer.parseInt(request.getParameter("id")) ;
				session.setAttribute("event_page", id);			
				response.getWriter().print(id);
		
		
	}

}
