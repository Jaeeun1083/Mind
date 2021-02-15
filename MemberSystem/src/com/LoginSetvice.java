package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginSetvice")
public class LoginSetvice extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 사용자가 입력한 id와 pw 콘솔창에 출력

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberDTO dto = new MemberDTO(id, pw);
		MemberDAO dao = new MemberDAO();

		String nick = dao.login(dto);

		if (nick != null) {
			// 로그인성공
			response.sendRedirect("loginSuccess.jsp?nick=" + nick);
		} else {
			// 로그인실패
			response.sendRedirect("login.jsp");
		}

	}

}
//오버로딩->매개변수의 개수나 데이터 타입이 달랐을때 동일한 이름의 메소드 정의->중복정의 오버로딩
// 오버라이딩-> 부모로 부터 물려받은 메소드를 자식틀래스에서 다시 재정의 한것->재정의 오버라이딩
