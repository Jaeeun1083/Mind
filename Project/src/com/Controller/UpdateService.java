package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.memberDAO;
import com.DTO.memberDTO;

import jdk.nashorn.internal.ir.SetSplitState;


@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. 세션값 가져오기 (로그인 한 id)
		HttpSession session = request.getSession();
		memberDTO dto = (memberDTO)session.getAttribute("member");
		String Id = dto.getId();
		
		//2. 값 받아오기(pw와 name)
		String Pw = request.getParameter("Pw");
		String Name = request.getParameter("Name");

		
		memberDTO Mem_dto = new memberDTO(Id, Pw, Name);
		//2. DAO 객체 생성
		memberDAO dao = new memberDAO();
		//3. DAO 클래스에 있는 updateMember(세션 value에 있는 이메일(조건), pw, tel, adress (수정할값))메소드 호출
		int cnt = dao.update(Mem_dto);
		
		
		//3. updateMember() 메소드 호출
		
		
		
		//4. 반환값 (-> 테이블 상에서 변화가 일어난 레코드 수)		
		
		if(cnt>0) {
			System.out.println("업데이트 성공");

			RequestDispatcher rd =  request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);			
			
		}else {
			System.out.println("업데이트 실패");
		}
		
	}

}