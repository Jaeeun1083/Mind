package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.writeDAO;
import com.DTO.memberDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/WriteSystem")
public class WriteSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			memberDTO dto = (memberDTO)session.getAttribute("member");
			String id = dto.getId();
			int cnt=0;
				String directory = request.getSession().getServletContext().getRealPath("/upload");
				int maxSize = 1024*1024*100;
				String encoding = "UTF-8";
				
				
				MultipartRequest mr = new MultipartRequest(request, directory, maxSize, encoding, 
						new DefaultFileRenamePolicy());
				
				
				String star= mr.getParameter("star");
				String text = mr.getParameter("text");
				
				writeDAO dao = new writeDAO();
				cnt=dao.updateDairy(id, text, star);
				
				
				// 사진부분
				String fileName = mr.getOriginalFileName("file");
				String fileRealName = mr.getFilesystemName("file");
				//System.out.println(fileName);
				//System.out.println(fileRealName);
				cnt= cnt + dao.updateImg( id , fileName , fileRealName);
				System.out.println(cnt);
				if(cnt>1) {
					session.setAttribute("member", dto);
					response.sendRedirect("main.html");	
				}
				else {	
					response.sendRedirect("write.jsp");
				}
				
	}

}
