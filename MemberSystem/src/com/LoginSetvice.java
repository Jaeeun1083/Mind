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

		// ����ڰ� �Է��� id�� pw �ܼ�â�� ���

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberDTO dto = new MemberDTO(id, pw);
		MemberDAO dao = new MemberDAO();

		String nick = dao.login(dto);

		if (nick != null) {
			// �α��μ���
			response.sendRedirect("loginSuccess.jsp?nick=" + nick);
		} else {
			// �α��ν���
			response.sendRedirect("login.jsp");
		}

	}

}
//�����ε�->�Ű������� ������ ������ Ÿ���� �޶����� ������ �̸��� �޼ҵ� ����->�ߺ����� �����ε�
// �������̵�-> �θ�� ���� �������� �޼ҵ带 �ڽ�Ʋ�������� �ٽ� ������ �Ѱ�->������ �������̵�
