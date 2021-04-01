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

import com.Roshni.DAO.Cart_DAO;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.Entity.CartItems;

/**
 * Servlet implementation class Addtocart
 */
@WebServlet("/addtocart")
public class Addtocart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		List li = null;
		String param = request.getParameter("id");
		CartItems cart = new CartItems();
		Cart_DAO cd = new Cart_DAO(MyConnection.connectTo());
		if(session.getAttribute("rg")!=null) {
			if(session.getAttribute("addToCart")== null) {
				li = new ArrayList();
				li.add(param);
				session.setAttribute("addToCart", li);
				
			}else {
				li = (List) session.getAttribute("addToCart");
				if(!li.contains(param)) {
					li.add(param); 
				}
				
				session.setAttribute("addToCart", li);
			}
			response.getWriter().print(li.size());
		}
		else {
			response.getWriter().print("Please Login");
		}
		
	}
}
