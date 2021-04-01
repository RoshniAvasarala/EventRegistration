package com.Roshni.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.Roshni.DBConnection.BCrypt;
import com.Roshni.Entity.Register;

public class RegisterDAO {
	Connection con;

	public RegisterDAO(Connection con) {
		this.con = con;
	}
	public  boolean insert(Register r) {
		String sql = "insert into register(name,student_id,emailid,password) values('"+r.getName()+"','"+r.getStudent_id()+"','"+r.getEmailid()+"','"+r.getPassword()+"')";
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
	public Register login(Register r) {
		
		
		String sql = "select * from register where student_id = '"+r.getStudent_id()+"'";
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			Register register = new Register();
			while (rs.next()) {
				System.err.println(rs.getString("student_id"));
				register.setId(rs.getInt("id"));
				register.setName(rs.getString("name"));
				register.setStudent_id(rs.getString("student_id"));
				register.setEmailid(rs.getString("emailid"));
				register.setPassword(rs.getString("password"));
				register.setRole(rs.getString("role"));
			}
			boolean bool = BCrypt.checkpw(r.getPassword(), register.getPassword());
			if(bool=true) {
				return register;
			}else {
				return null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	public List getAll() {
		String sql = "select * from register";
		List li = new ArrayList();
		
		try {
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(sql);
			
			while (rs.next()) {
				Register register = new Register();
				register.setId(rs.getInt("id"));
				register.setName(rs.getString("name"));
				register.setStudent_id(rs.getString("student_id"));
				register.setEmailid(rs.getString("emailid"));
				register.setPassword(rs.getString("password"));
				register.setRole(rs.getString("role"));
				li.add(register);
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
			String sql = "delete from register where id ="+id;
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
