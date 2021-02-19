package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

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
		
		response.setContentType("text/html;charset=UTF-8");
		//request.setContentType("text/html;charset=UTF-8");
		
		String Id = request.getParameter("id");
		String Pw = request.getParameter("pw");
		String Name = request.getParameter("name");
		int Phone = Integer.parseInt(request.getParameter("phone"));		
		int cnt = 0;
		
		System.out.println(Name);
		
		memberDAO dao = new memberDAO();
						
		cnt = dao.joinMember(Id, Pw, Name, Phone);
		
		PrintWriter out = response.getWriter();
		
		out.print(Name);
		
	}
}
