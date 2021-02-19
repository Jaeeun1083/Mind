package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.memberDAO;
import com.DTO.memberDTO;


@WebServlet("/pwCom")
public class pwCom extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		
		memberDTO dto = (memberDTO)session.getAttribute("member");
		
		memberDAO dao = new memberDAO();
		
		String id = dto.getId();
		
		System.out.println(id);
		
		String pw1=dao.pwload(id);
		
		PrintWriter out = response.getWriter();
		
		if(pw.equals(pw1)) {
			out.print(true);
		}
		
	}

}
