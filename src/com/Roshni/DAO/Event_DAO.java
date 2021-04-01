package com.Roshni.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.Roshni.DBConnection.BCrypt;
import com.Roshni.Entity.EventCat;
import com.Roshni.Entity.Events;
import com.Roshni.Entity.Register;

public class Event_DAO {
	Connection con;

	public Event_DAO(Connection con) {
		this.con = con;
	}
	public  boolean insert(Events events) {
		String sql = "insert into events(title,cost,description,event_category_id,date_time,image) values('"+ events.getTitle()+"','"+events.getCost()+"','"+events.getDescription()+"','"+events.getEvent_category_id()+"','"+events.getDate_time()+"','"+events.getFile_name()+"')";
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
		String sql = "select * from events";
		List li = new ArrayList();
		
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			
			while (rs.next()) {
				Events events = new Events();
				events.setId(rs.getInt("id"));
				events.setTitle(rs.getString("title"));
				events.setCost(rs.getFloat("cost"));
				events.setDescription(rs.getString("description"));
				events.setEvent_category_id(rs.getInt("event_category_id"));
				events.setDate_time(rs.getString("date_time"));
				events.setStatus(rs.getInt("status"));
				events.setFile_name(rs.getString("image"));
				
				li.add(events);
			}
			
			
			return li;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	
	public Events findById(int id) {
		String sql = "select * from events where id = "+id;
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			Events events = new Events();
			while (rs.next()) {
				
				events.setId(rs.getInt("id"));
				events.setTitle(rs.getString("title"));
				events.setCost(rs.getFloat("cost"));
				events.setDescription(rs.getString("description"));
				events.setEvent_category_id(rs.getInt("event_category_id"));
				events.setDate_time(rs.getString("date_time"));
				events.setStatus(rs.getInt("status"));
				events.setFile_name(rs.getString("image"));				
				
			}
			return events;			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	
	public boolean delete(int id) {
		
		try {
			String sql = "delete from events where id ="+id;
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
