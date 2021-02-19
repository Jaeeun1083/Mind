<%@page import="com.DTO.memberDTO"%>
<%@page import="com.DTO.drawDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.DAO.drawDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Team Project</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.css" />
<script src="https://d3js.org/d3.v3.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.js"></script>
<style type="text/css">
#top {
	position: relative;
	left: 111px;
	width: 216px;
	height: 70px;
	background-color: white;
	margin-top: 1.08px;
	text-align: center;
	border-radius: 10px 10px 0px 0px;
	box-shadow: -6px -4px 5px gray;
	border-radius: 10px 10px 0px 0px;
	text-align: center;
	border-radius: 10px 10px 0px 0px;
}

#d1 {
	z-index: 6;
}

#d2 {
	z-index: 5;
}

#d3 {
	z-index: 4;
}

#d1:hover {
	z-index: 8;
}

#d2:hover {
	z-index: 8;
}

#d3:hover {
	z-index: 8;
}

#out {
	width: 1080px;
	height: 1080px;
}
</style>
</head>
<body class="is-preload" style="margin: 0px;">
	<%
		HttpSession sessions = request.getSession();	
		memberDTO dto = (memberDTO)session.getAttribute("member");
		String id = dto.getId();
		drawDAO dao1 = new drawDAO();	
		ArrayList<drawDTO> arr = dao1.drawscore1(id);
		
	%>
	<div id="out">
		<div id="top" style="text-align: center; vertical-align: middle;">
			<span class="date" style=""><span class="month"></span> <span
				class="day" style="font-size: 20px;"> <br>
					<h2>마이페이지</h2>
			</span></span>
		</div>

		<div id="content"
			style="height: 1004px; width: 1500px; padding-top: 0px; padding-bottom: 0px; position: relative;">

			<article class="box post post-excerpt">
				<div class="inner" style="height: 1060px;">
					<header style="display: block;" id="h1">
						<h2>
							<a>비밀번호입력</a>
						</h2>
						<p>비밀번호</p>
						<P>
							<input type="password" id="input_pw1"> <input
								type="submit" value="다음" onclick="h1()">
						</P>
					</header>
					<header style="display: none;" id="h2">
						<h2>
							<a>회원정보수정</a>
						</h2>
						<p>
							이름 : <input type="text" id="input_name">
						</p>
						<P>
							비밀번호 : <input type="password" id="input_pw2">
						</P>
						<p>
							전화번호 : <input type="number" id="input_number">
						</p>
						<input type="submit" value="다음" onclick="h2()">
					</header>
					<header style="display: none;" id="h3">
						<h2>
							<a>나의통계</a>
						</h2>
						<input type="submit" value="나의 그래프 보기" onclick="h3()">
					</header>
					<header style="display: none;" id="h3">
						<h2>
							<a>나의통계</a>
						</h2>
						<input type="submit" value="나의 그래프 보기" onclick="h3()">
						<P>
							<script type="text/javascript">
								var chart = c3.generate({
									data : {
										x : 'x',
										columns : [ 
											[ 'x', ],//x축 
											[ 'score', ] //y축값

										]
									},
									axis : {
										x : {
											type : 'timeseries',
											tick : {
												format : '%Y/%m/%d'
											}
										}
									}
								});
							</script>
						</P>
					</header>
					<header style="display: none;" id="h4">
						<h2>
							<a>내가 쓴 일기 목록</a>
						</h2>
						<p>비밀번호</p>
						<P>
							<input type="password" id="input_pw"> <input
								type="submit" value="다음" onclick="h1()">
						</P>
					</header>
					<img src="images/pic02.jpg">
					<div class="info"
						style="position: relative; top: -739px; height: 240px; box-shadow: -8px 0px 7px 2px gray;"
						id="d1" onclick="d1()">
						<div>
							<span class="date"><span class="month"></span> <span
								class="day" style="font-size: 20px;">
									<hr style="margin-bottom: 5px; margin-top: 0px; padding: 3px;">
									<a style="color: black;" id="update">개<br>인<br>정<br>보<br>수<br>정
								</a>
									<hr style="margin-top: 5px; padding: 3px;">
							</span></span>
						</div>
					</div>


					<div class="info" onclick="d2()"
						style="position: relative; top: -745px; height: 240px; box-shadow: -8px 0px 7px 2px gray;"
						id="d2">
						<span class="date"><span class="month"></span> <span
							class="day" style="font-size: 20px;">
								<hr style="margin-bottom: 5px; margin-top: 0px; padding: 3px;">
								<a style="color: black;">나<br>의<br>통<br>계<br>확<br>인
							</a>
								<hr style="margin-top: 5px; padding: 3px;">
						</span></span>
					</div>


					<div class="info" onclick="d3()"
						style="position: relative; top: -751px; height: 268px; box-shadow: -8px 0px 7px 2px gray;"
						id="d3">
						<span class="date"><span class="month"></span><span
							class="day" style="font-size: 20px;">
								<hr style="margin-bottom: 5px; margin-top: 0px; padding: 3px;">
								<a style="color: black;">내<br>가<br>쓴<br>일<br>기<br>목<br>록
							</a>
								<hr style="margin-top: 5px; padding: 3px;">
						</span></span>
					</div>

				</div>
			</article>
		</div>
	</div>
	<!-- Sidebar -->
	<div id="sidebar">
		<!-- login
					<nav id="nav">
						<ul>
							<li><a href="#">로그인</a></li>
							<li><a href="#">회원가입</a></li>
						</ul>
					</nav><br> -->
		<!-- Logo -->
		<h1 id="logo">
			<a href="main.html">Title</a>
		</h1>

		<!-- Nav -->
		<nav id="nav">
			<ul>
				<li class="current"><a href="#">Latest Post</a></li>
				<li><a href="about.jsp">사이트 소개</a></li>
				<li><a href="write.jsp">일기 작성</a></li>
				<li><a href="make.jsp">책 제작하기</a></li>
				<li><a href="mypage.jsp">마이페이지</a></li>

			</ul>
		</nav>



		<!-- Text -->
		<section class="box text-style1">
			<div class="inner">
				<p>
					<strong>Project:</strong>나를 알아가는 5분의 시간
				</p>
			</div>
		</section>



		<!-- Calendar -->
		<section class="box calendar">
			<div class="inner">
				<table>
					<caption>July 2014</caption>
					<thead>
						<tr>
							<th scope="col" title="Monday">M</th>
							<th scope="col" title="Tuesday">T</th>
							<th scope="col" title="Wednesday">W</th>
							<th scope="col" title="Thursday">T</th>
							<th scope="col" title="Friday">F</th>
							<th scope="col" title="Saturday">S</th>
							<th scope="col" title="Sunday">S</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td colspan="4" class="pad"><span>&nbsp;</span></td>
							<td><span>1</span></td>
							<td><span>2</span></td>
							<td><span>3</span></td>
						</tr>
						<tr>
							<td><span>4</span></td>
							<td><span>5</span></td>
							<td><a href="#">6</a></td>
							<td><span>7</span></td>
							<td><span>8</span></td>
							<td><span>9</span></td>
							<td><a href="#">10</a></td>
						</tr>
						<tr>
							<td><span>11</span></td>
							<td><span>12</span></td>
							<td><span>13</span></td>
							<td class="today"><a href="#">14</a></td>
							<td><span>15</span></td>
							<td><span>16</span></td>
							<td><span>17</span></td>
						</tr>
						<tr>
							<td><span>18</span></td>
							<td><span>19</span></td>
							<td><span>20</span></td>
							<td><span>21</span></td>
							<td><span>22</span></td>
							<td><a href="#">23</a></td>
							<td><span>24</span></td>
						</tr>
						<tr>
							<td><a href="#">25</a></td>
							<td><span>26</span></td>
							<td><span>27</span></td>
							<td><span>28</span></td>
							<td class="pad" colspan="3"><span>&nbsp;</span></td>
						</tr>
					</tbody>
				</table>
			</div>
		</section>

		<!-- Copyright -->
		<ul id="copyright">
			<li>&copy; Project</li>
			<li>스마트인재개발원 <a><br>스마트c조</a></li>
		</ul>

	</div>

	<!-- Scripts -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
	<script type="text/javascript">
		function h1() {
			var input_pw1 = document.getElementById("input_pw1");
			$.ajax({
				type : "post",
				data : {
					"pw" : input_pw1.value
				},
				url : "pwCom",
				dataType : "text",
				success : function(data) {
					if (data == "true") {
						document.getElementById("h1").style.display = "none";
						document.getElementById("h2").style.display = "block";
						document.getElementById("d1").style.top = "-849px";
						document.getElementById("d2").style.top = "-855px";
						document.getElementById("d3").style.top = "-861px";
					}
				}
			});
		}
	</script>
	<script type="text/javascript">
		function h2() {
			var input_pw2 = document.getElementById("input_pw2");
			var input_name = document.getElementById("input_name");
			var input_pn = document.getElementById("input_number");

			$.ajax({
				type : "post",
				data : {
					"pw" : input_pw2.value,
					"name" : input_name.value,
					"phone" : input_pn.value
				},
				url : "updateService",
				dataType : "text",
				success : function(data) {
					alert(data);
					document.getElementById("h2").style.display = "none";
					document.getElementById("h1").style.display = "block";
					document.getElementById("d1").style.top = "-739px";
					document.getElementById("d2").style.top = "-745px";
					document.getElementById("d3").style.top = "-751px";

				}
			});
		}
	</script>
	<script type="text/javascript">
		function d1() {
			document.getElementById("h1").style.display = "block";
			document.getElementById("h3").style.display = "none";
			document.getElementById("h4").style.display = "none";

			document.getElementById("d1").style.zIndex = "3";
			document.getElementById("d2").style.zIndex = "2";
			document.getElementById("d3").style.zIndex = "1";
		}
	</script>
	<script type="text/javascript">
		function d2() {
			document.getElementById("h3").style.display = "block";
			document.getElementById("h1").style.display = "none";
			document.getElementById("h4").style.display = "none";

			document.getElementById("d2").style.zIndex = "3";
			document.getElementById("d1").style.zIndex = "2";
			document.getElementById("d3").style.zIndex = "1";
		}
	</script>
	<script type="text/javascript">
		function d3() {
			document.getElementById("h4").style.display = "block";
			document.getElementById("h1").style.display = "none";
			document.getElementById("h3").style.display = "none";

			document.getElementById("d3").style.zIndex = "3";
			document.getElementById("d2").style.zIndex = "2";
			document.getElementById("d1").style.zIndex = "1";
		}
	</script>

</body>