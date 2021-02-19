package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.DTO.drawDTO;

public class drawDAO {
	
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
	
	public ArrayList<drawDTO> drawscore1(String id){		
		String get_score= null;
		String get_date=null;
		drawDTO dto = null;
		ArrayList<drawDTO> arr = new ArrayList<drawDTO>();		
		
		try {
			connect();
			
			String sql = "select * from memberdiary where diaryid=?";
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, id);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				get_score = rs.getString("score");
				get_date = rs.getString("m_date");
				
				dto=new drawDTO(get_date, get_score);
				
				arr.add(dto);				
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return arr;		
	}
	public ArrayList<drawDTO> drawscore2(String id){		
		String get_score= null;
		String get_date=null;
		drawDTO dto = null;
		ArrayList<drawDTO> arr = new ArrayList<drawDTO>();		
		
		try {
			connect();
			
			String sql = "select * from memberdiary where diaryid=?";
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, id);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				get_score = rs.getString("score");
				get_date = rs.getString("m_date");
				
				dto=new drawDTO(get_date, get_score);
				
				arr.add(dto);				
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return arr;		
	}
}
