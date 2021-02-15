package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.memberDAO;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		
		String Id = request.getParameter("id");
		String Pw = request.getParameter("pw");
		String Name = request.getParameter("name");
		int PhonNumber = Integer.parseInt(request.getParameter("PhonNumber"));		
		int cnt = 0;
		
		memberDAO dao = new memberDAO();
						
		cnt = dao.joinMember(Id, Pw, Name, PhonNumber);
		
		if(cnt>0) {
			request.setAttribute("joinemail", Name);
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			rd.forward(request, response);
		}						
	}
}
