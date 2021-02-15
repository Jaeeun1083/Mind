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

		//1. ���ǰ� �������� (�α��� �� id)
		HttpSession session = request.getSession();
		memberDTO dto = (memberDTO)session.getAttribute("member");
		String Id = dto.getId();
		
		//2. �� �޾ƿ���(pw�� name)
		String Pw = request.getParameter("Pw");
		String Name = request.getParameter("Name");

		
		memberDTO Mem_dto = new memberDTO(Id, Pw, Name);
		//2. DAO ��ü ����
		memberDAO dao = new memberDAO();
		//3. DAO Ŭ������ �ִ� updateMember(���� value�� �ִ� �̸���(����), pw, tel, adress (�����Ұ�))�޼ҵ� ȣ��
		int cnt = dao.update(Mem_dto);
		
		
		//3. updateMember() �޼ҵ� ȣ��
		
		
		
		//4. ��ȯ�� (-> ���̺� �󿡼� ��ȭ�� �Ͼ ���ڵ� ��)		
		
		if(cnt>0) {
			System.out.println("������Ʈ ����");

			RequestDispatcher rd =  request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);			
			
		}else {
			System.out.println("������Ʈ ����");
		}
		
	}

}