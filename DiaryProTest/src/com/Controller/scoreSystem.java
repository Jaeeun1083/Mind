package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.scoreDAO;
import com.DTO.memberDTO;
import com.DTO.scoreDTO;


@WebServlet("/scoreSystem")
public class scoreSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		memberDTO dto = (memberDTO)session.getAttribute("member");
//		���� WriteSystem���� sendRedirect�� ���̽����� ��� ����.
//		���̽����κ��� �Ѱܹ��� ���ھ�
		String score = request.getParameter("score");
		
		String id = dto.getId();
		
		scoreDTO sdto = new scoreDTO(id,score);
//		�ϱ⸦ �� ��¥�� ��� �ҷ�����?
		
		scoreDAO dao = new scoreDAO();
		
		int cnt = dao.updateScore(sdto);
		
		if(cnt>1) {
			session.setAttribute("member", dto);
			response.sendRedirect("main.html");	
		}
		else {	
			response.sendRedirect("write.jsp");
		}
		
//		id�� date�� score�� ��� (scoreDTO����) �����ͺ��̽��� �Է�(scoreDAO)
//		scoreDAO�� insert��. where id=? date=?
//		���� main.jsp�� �̵��ϸ� ��.
		
	}

}
