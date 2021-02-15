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
	
	<!-- 상단 메뉴 바 -->
	<div>
		<div><h1><a href="main.jsp">오늘의 기분</a></h1></div>
		<div><a href="#">About Us</a></div>				
		<%if(dto!=null){%>
		<div><a href="WriteSystem">오늘의 일기 쓰기</a></div>
		<%}else{%>
		<div><a href="LoginSystem">오늘의 일기 쓰기</a></div>
		<%}%>								
		<div>책만들기</div>
	</div>
	
	
	
	
	
</body>
</html>