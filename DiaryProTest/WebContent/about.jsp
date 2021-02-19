<%@page import="com.DTO.memberDTO"%>
<%@page import="cal.calendarfuc"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE HTML>
<!--
	Striped by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Team Project</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<link rel="stylesheet" href="2115_marvel/css/bootstrap.min.css?after">
		<link rel="stylesheet" href="2115_marvel/css/unicons.css">
		<link rel="stylesheet" href="2115_marvel/css/owl.carousel.min.css">
		<link rel="stylesheet" href="2115_marvel/css/owl.theme.default.min.css">
		<link rel="stylesheet" href="2115_marvel/css/tooplate-style.css?after">
		<style>
			
		</style>
	</head>
<%
	calendarfuc cf = new calendarfuc();
	String month = cf.en_month(cf.getMonth());
	HttpSession sessions = request.getSession();	
	memberDTO dto = (memberDTO)session.getAttribute("member");
%>
	<body class="is-preload">





		<!-- Content -->
			<div id="content">
				<br><br>
				<div class="inner">
					<article class="box post post-excerpt">
							<div class="info">
								<span class="date"><span class="month"><%=month %><span>y</span></span> <span class="day"><%=cf.getDay() %></span><span class="year">, 2014</span></span>
								<ul class="stats">
									<li><a href="#" class="icon fa-comment">16</a></li>
									<li><a href="#" class="icon fa-heart">32</a></li>
									<li><a href="#" class="icon brands fa-twitter">64</a></li>
									<li><a href="#" class="icon brands fa-facebook-f">128</a></li>
								</ul>
							</div>
					
					
					
					
					
					
					
					
					
					
					
					<!-- Post -->
						<section class="" id="about">
							<div class="container">
								<div class="row">
			
									<div class="col-lg-7 col-md-12 d-flex align-items-center" >
										<div class="about-text">
											<small class="small-text">Welcome to <span class="mobile-block">Our Diary!</span></small>
											<h1 class="animated animated-text">
												<span class="mr-2">오늘의 감정을</span>
													<div class="animated-info">
													<span class="animated-item">기록하세요</span>
													<span class="animated-item">공유하세요</span>
													<span class="animated-item">기억하세요</span>
													</div>
											</h1>
						
												<p>하루 5분 나와 마주하는 시간</p>
						
											<div class="custom-btn-group mt-4">
												<a href="write.jsp" class="btn custom-btn custom-btn-bg custom-btn-link">일기쓰러가기</a>
											</div>
							
										</div>
									</div>
				
									<div class="col-lg-5 col-md-12 col-12">
										<div class="about-image jpg">
											<img src="images/female-865110_1920.jpg"  class="img-fluid" alt="jpg image">
										</div>
									</div>
								</div>
							</div>
						</section>

					
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
							<li ><a href="#">Latest Post</a></li>
							<li class="current"><a href="about.jsp">사이트 소개</a></li>
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
						<li>&copy; Project</li><li>스마트인재개발원 <a><br>스마트c조</a></li>
					</ul>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>