package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.drawDAO;
import com.DTO.drawDTO;
import com.DTO.memberDTO;

@WebServlet("/DrawService")
public class DrawServiceDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		memberDTO dto = (memberDTO)session.getAttribute("member");
		String id = dto.getId();
		
		drawDAO dao = new drawDAO();
		
		ArrayList<drawDTO> arr = new ArrayList<drawDTO>();
						
		PrintWriter out = response.getWriter();
						
		arr=dao.drawscore1(id);
		for(int i =0; i<arr.size(); i++) {
		
			out.print(arr.get(i).getDate());}
			
	}

}
