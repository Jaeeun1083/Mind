package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.memberDAO;
import com.DTO.memberDTO;


@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Id = request.getParameter("id");
		String Pw = request.getParameter("pw");
		
		
		memberDAO dao = new memberDAO();
		
		memberDTO dto = dao.loginMember(Id, Pw);
		
		if(dto !=null) {
			
			HttpSession session = request.getSession();
			
			session.setAttribute("member", dto);
			
			response.sendRedirect("main.jsp");			
		}else {	
			response.sendRedirect("main.jsp");
		}		
	}
}
