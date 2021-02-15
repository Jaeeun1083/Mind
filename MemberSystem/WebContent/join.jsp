<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="JoinService" method="post">
		ID : <input type="text" name="id"><br>
		NICK : <input type="text" name="nick"><br>
		PW : <input type="password" name="pw"><br>
		<input type="submit" value="회원가입">	
	</form>	
</body>
</html>