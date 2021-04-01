package com.Roshni.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Roshni.Entity.CartItems;


public class Cart_DAO {
	Connection con;

	public Cart_DAO(Connection con) {
		this.con = con;
	}
	public  boolean insert(CartItems cart) {
		String sql = "insert into cart-items(student_id, event_id) values('"+cart.getStudent_id() +"','"+cart.getEvent_id()+"')";
		try {
			
			Statement st = con.createStatement();
			st.execute(sql);
			st.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		return false;
		
	}
	
	public List getAll() {
		String sql = "select * from cart-items";
		List li = new ArrayList();
		
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			
			while (rs.next()) {
				CartItems cart = new CartItems();
				cart.setId(rs.getInt("id"));
				cart.setStudent_id(rs.getInt("student_id"));
				
				cart.setEvent_id(rs.getInt("event_id"));
				
				
				li.add(cart);
			}
			
			
			return li;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	
	public CartItems findBystudentid(int student_id) {
		String sql = "select * from cart-items where student_id = "+student_id;
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			CartItems cart = new  CartItems();
			while (rs.next()) {
				
				cart.setId(rs.getInt("id"));
				cart.setStudent_id(rs.getInt("student_id"));
				
				cart.setEvent_id(rs.getInt("event_id"));
							
				
			}
			return cart;		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	
	public boolean delete(int id) {
		
		try {
			String sql = "delete from cart_items where id ="+id;
			Statement st = con.createStatement();
			int status = st.executeUpdate(sql);
			if(status>0) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return false;
		
	}
	
	
}
