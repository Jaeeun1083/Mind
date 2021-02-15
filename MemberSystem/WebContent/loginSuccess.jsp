<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 로그인 성공시 로그인한 nick값을 받아 해당 페이지에서 nick 님 환영합니다. 출력 -->
	<%String nick = request.getParameter("nick"); %>
	<h3><%= nick %>님 환영합니다.</h3>
</body>
</html>