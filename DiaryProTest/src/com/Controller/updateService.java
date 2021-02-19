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


@WebServlet("/updateService")
public class updateService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		memberDTO dto = (memberDTO)session.getAttribute("member");
		String id = dto.getId();
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		int phone = Integer.parseInt(request.getParameter("phone"));		
						
		memberDTO dto1 = new memberDTO(id, pw, name, phone);
							
		memberDAO dao = new memberDAO();
						
		int cnt = dao.updateMember(dto1);
								
		if(cnt>0) {						
			PrintWriter out = response.getWriter();
			out.print("회원정보수정완료");
										
		}else {
			
		}						
	}
}
