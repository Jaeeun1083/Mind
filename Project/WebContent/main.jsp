<%@page import="com.DTO.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css"> 
a { text-decoration:none } 
</style> 
</head>
<body>
	<%
	memberDTO dto = (memberDTO) session.getAttribute("member");
	%>
	
	<!-- ��� �޴� �� -->
	<div>
		<div><h1><a href="main.jsp">������ ���</a></h1></div>
		<div><a href="#">About Us</a></div>				
		<%if(dto!=null){%>
		<div><a href="WriteSystem">������ �ϱ� ����</a></div>
		<%}else{%>
		<div><a href="LoginSystem">������ �ϱ� ����</a></div>
		<%}%>								
		<div>å�����</div>
	</div>
	
	
	
	
	
</body>
</html>