package com.Roshni.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.Roshni.DBConnection.BCrypt;
import com.Roshni.Entity.EventCat;
import com.Roshni.Entity.Register;

public class EventCat_DAO {
	Connection con;

	public EventCat_DAO(Connection con) {
		this.con = con;
	}
	public  boolean insert(EventCat ec) {
		String sql = "insert into event_category(title) values('"+ec.getTitle()+"')";
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
		String sql = "select * from event_category";
		List li = new ArrayList();
		
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			
			while (rs.next()) {
				EventCat ec = new EventCat();
				ec.setId(rs.getInt("id"));
				ec.setTitle(rs.getString("title"));
				ec.setStatus(rs.getInt("status"));
				li.add(ec);
			}
			
			
			return li;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	public boolean delete(int id) {
		
		try {
			String sql = "delete from event_category where id ="+id;
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
