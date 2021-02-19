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
//		먼저 WriteSystem에서 sendRedirect를 파이썬으로 경로 설정.
//		파이썬으로부터 넘겨받을 스코어
		String score = request.getParameter("score");
		
		String id = dto.getId();
		
		scoreDTO sdto = new scoreDTO(id,score);
//		일기를 쓴 날짜를 어떻게 불러오지?
		
		scoreDAO dao = new scoreDAO();
		
		int cnt = dao.updateScore(sdto);
		
		if(cnt>1) {
			session.setAttribute("member", dto);
			response.sendRedirect("main.html");	
		}
		else {	
			response.sendRedirect("write.jsp");
		}
		
//		id와 date와 score를 묶어서 (scoreDTO생성) 데이터베이스에 입력(scoreDAO)
//		scoreDAO는 insert문. where id=? date=?
//		이제 main.jsp로 이동하면 됨.
		
	}

}
