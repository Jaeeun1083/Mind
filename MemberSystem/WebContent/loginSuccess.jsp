<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- �α��� ������ �α����� nick���� �޾� �ش� ���������� nick �� ȯ���մϴ�. ��� -->
	<%String nick = request.getParameter("nick"); %>
	<h3><%= nick %>�� ȯ���մϴ�.</h3>
</body>
</html>