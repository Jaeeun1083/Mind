package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class writeDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	public void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int updateImg(String id, String fileName , String fileRealName) {
		
		try {
			connect();
			String sql = "insert into memberdiary_lmage values(?,?,?,sysdate)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, fileName);
			ps.setString(3, fileRealName);
			
			return ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	public int updateDairy(String id, String text, String star){
		try {
			connect();
			String sql = "insert into memberdiary values(?,?,?,sysdate)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, star);
			ps.setString(3, text);
			
			return ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	


}
