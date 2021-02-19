package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.DTO.memberDTO;

public class memberDAO {
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
	
	public int joinMember(String email, String pw, String name,int phone) {
		int cnt = 0;

		try {
			connect();
			String sql = "INSERT INTO member VALUES(?,?,?,?)";

			ps = conn.prepareStatement(sql);

			ps.setString(1, email);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setInt(4, phone);

			cnt = ps.executeUpdate();

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
		}
		return cnt;
	}

	public memberDTO loginMember(String id, String pw) {
		String get_id = null;
		String get_pw = null;
		String get_name = null;
		int get_pn = 0;
		memberDTO dto = null;
		try {
			connect();
			String sql = "select * from member where id=? and pw=?";

			ps = conn.prepareStatement(sql);

			ps.setString(1, id);
			ps.setString(2, pw);

			rs = ps.executeQuery();

			if (rs.next()) {
				get_id = rs.getString("id");
				get_pw = rs.getString("pw");
				get_name = rs.getString("name");
				get_pn = rs.getInt("phone");

				dto = new memberDTO(get_id, get_pw, get_name, get_pn);

			} else {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return dto;

	}

	public int updateMember(memberDTO dto) {
		int cnt = 0;
		try {
			connect();
			String sql = "update member set pw=?,name=?,phone=? where id=?";

			ps = conn.prepareStatement(sql);
		
			System.out.println(dto.getPw());
			
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getPhone());
			ps.setString(4, dto.getId());

			cnt = ps.executeUpdate();

		} catch (SQLException e) {

		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

			}
		}
		return cnt;
	}
	
	public String pwload(String id) {
				
		String get_pw = null;
		
		try {
			connect();
			String sql = "select pw from member where id=?";

			ps = conn.prepareStatement(sql);

			ps.setString(1, id);
			
			rs = ps.executeQuery();

			if (rs.next()) {				
				get_pw = rs.getString("pw");
								
			} else {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return get_pw;

	}
	
	
	public ArrayList<memberDTO> selectMember() {
		String get_name = null;
		String get_id = null;
		int get_pn = 0;
		memberDTO dto = null;
		ArrayList<memberDTO> arr = new ArrayList<memberDTO>();
		try {
			connect();

			String sql = "select * from member where id != 'admin'";

			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				get_id = rs.getString("id");
				get_name = rs.getString("name");
				get_pn = rs.getInt("phone");

				dto = new memberDTO(get_id, get_name, get_pn);

				arr.add(dto);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}

		return arr;

	}

	public int deleteMember(String id) {
		
		int cnt = 0;
		
		try {
			connect();
			
			String sql = "delete from member where id=?";
			ps=conn.prepareStatement(sql);
			
			ps.setString(1,id);
			
			cnt=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();

		}return cnt;
				
		
	}

	public boolean idCheck(String id) {
		
		boolean check = true;
		
		try {
			
			connect();
			
			String sql = "select * from member where id=?";
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1,id);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				check=true;
			}else {
				check=false;
			}
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return check;
		
	}

	
}




