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
		// 0.(명심)해당되는 DBMS 드라이버 파일을 내 프로젝트 안에 넣어주기
		
		MemberDTO dto = new MemberDTO(id, nick, pw);
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(dto);
		
		
//		int cnt = 0;
//		java.sql.Connection conn = null;
//		PreparedStatement psmt = null;
//
//		// 1.드라이버 동적로딩(어떠한 DBMS를 사용할 것인지 명시)
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			// 2.커넥션 연결(Java 와 DataBase 간의 통로를 구축)
//			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String db_id = "hr";
//			String db_pw = "hr";
//			conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//			// 3.SQL문 작성 및 실행
//			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
//
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, id);
//			psmt.setString(2, nick);
//			psmt.setString(3, pw);
//
//			// select만 query
//
//			cnt = psmt.executeUpdate();
//
//		} catch (ClassNotFoundException e) {
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 코드가 무조건 넘어오는 구간
//			// 4.연결종료
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
			System.out.println("회원가입 성공");
			response.sendRedirect("Main.jsp");
		} else {
			System.out.println("회원가입 실패");
			response.sendRedirect("join.jsp");
		}

	}

}
