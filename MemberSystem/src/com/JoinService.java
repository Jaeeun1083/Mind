package com;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// id, nick, pw
		String id = request.getParameter("id");
		String nick = request.getParameter("nick");
		String pw = request.getParameter("pw");
		// 0.(���)�ش�Ǵ� DBMS ����̹� ������ �� ������Ʈ �ȿ� �־��ֱ�
		
		MemberDTO dto = new MemberDTO(id, nick, pw);
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(dto);
		
		
//		int cnt = 0;
//		java.sql.Connection conn = null;
//		PreparedStatement psmt = null;
//
//		// 1.����̹� �����ε�(��� DBMS�� ����� ������ ���)
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			// 2.Ŀ�ؼ� ����(Java �� DataBase ���� ��θ� ����)
//			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String db_id = "hr";
//			String db_pw = "hr";
//			conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//			// 3.SQL�� �ۼ� �� ����
//			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
//
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, id);
//			psmt.setString(2, nick);
//			psmt.setString(3, pw);
//
//			// select�� query
//
//			cnt = psmt.executeUpdate();
//
//		} catch (ClassNotFoundException e) {
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// �ڵ尡 ������ �Ѿ���� ����
//			// 4.��������
//
//			try {
//
//				if (psmt != null) {
//					psmt.close();
//				}
//				if (conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		if (cnt > 0) {
			System.out.println("ȸ������ ����");
			response.sendRedirect("Main.jsp");
		} else {
			System.out.println("ȸ������ ����");
			response.sendRedirect("join.jsp");
		}

	}

}
