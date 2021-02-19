
<%@page import="com.DTO.memberDTO"%>
<%@page import="cal.calendarfuc"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="assets/css/star.css">
    <link rel="stylesheet" type="text/css" href="assets/css/checkbox.css">
    <link rel="stylesheet" href="assets/css/main.css" />

</head>
<%
	calendarfuc cf = new calendarfuc();
	String month = cf.en_month(cf.getMonth());
	HttpSession sessions = request.getSession();	
	memberDTO dto = (memberDTO)session.getAttribute("member");
%>
<body>
<!-- main -->	
	<div id="content">
				<div class="inner">
				<article class="box post post-excerpt">
							<div class="info">
								<span class="date"><span class="month"><%=month %><span>y</span></span> <span class="day"><%=cf.getDay() %></span><span class="year">, 2014</span></span>
								<!--
									Note: You can change the number of list items in "stats" to whatever you want.
								-->
								<ul class="stats">
									<li><a href="#" class="icon fa-comment">16</a></li>
									<li><a href="#" class="icon fa-heart">32</a></li>
									<li><a href="#" class="icon brands fa-twitter">64</a></li>
									<li><a href="#" class="icon brands fa-facebook-f">128</a></li>
								</ul>
							</div>
							
						
			
						
	<form action="WriteSystem" method="post" enctype="multipart/form-data">
	<header>
	<h2><%=cf.getMonth()+1 %>�� <%=cf.getDay() %>��</h2>
	<p>���� ����� �Ϸ�� �����?</p>
	</header>
	<br>
	<!-- �ϱ����� -->
    <div class="form-group">
		<h3>����</h3>
		<input type="text" name="title">
	</div><br>

    
    <!-- �ϱ��ۼ� -->
	<h3>�ϱ��ۼ�</h3>
	<div class="form-group">
		<label for=""></label>
		<textarea class="form-control" id="" rows="10" placeholder="���� �����ּ���" name="text"></textarea>
	</div><br>
	
	
	
	
	<!-- ���� ���ε� -->
	<div class="form-group">
	<label for="">������ �÷�������</label><br>
	<input type="file" class="form-control-file" name="file">
	</div>
	
	
	<br>
		<h3>���� �Ϸ� ����</h3>
<div class="startRadio">
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="1">
    <span class="startRadio__img"><span class="blind">�� 1��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="1.5">
    <span class="startRadio__img"><span class="blind">�� 1.5��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="2">
    <span class="startRadio__img"><span class="blind">�� 2��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="2.5">
    <span class="startRadio__img"><span class="blind">�� 2.5��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="3">
    <span class="startRadio__img"><span class="blind">�� 3��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="3.5">
    <span class="startRadio__img"><span class="blind">�� 3.5��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="4">
    <span class="startRadio__img"><span class="blind">�� 4��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value= "4.5">
    <span class="startRadio__img"><span class="blind">�� 4.5��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value="5">
    <span class="startRadio__img"><span class="blind">�� 5��</span></span>
  </label>
  <label class="startRadio__box">
    <input type="radio" name="star" id="" value=5.5>
    <span class="startRadio__img"><span class="blind">�� 5.5��</span></span>
  </label>
</div>
	<br><br><br>
	
	<input type="submit" value="�ϱ��ۼ��Ϸ�">
	</form>
	
	</article>
	</div>
	</div>
	
	
	
	
	
	
	
	
	<!-- Sidebar -->
			<div id="sidebar">
				<!-- login
					<nav id="nav">
						<ul>
							<li><a href="#">�α���</a></li>
							<li><a href="#">ȸ������</a></li>
						</ul>
					</nav><br> -->
				<!-- Logo -->
					<h1 id="logo"><a href="#">Title</a></h1>

				<!-- Nav -->
					<nav id="nav">
						<ul>
							<li><a href="#">Latest Post</a></li>
							<li><a href="about.jsp">����Ʈ �Ұ�</a></li>
							<li class="current"><a href="write.jsp">�ϱ� �ۼ�</a></li>
							<li><a href="make.jsp">å �����ϱ�</a></li>
							<li><a href="mypage.jsp">����������</a></li>
							
						</ul>
					</nav>

				

				<!-- Text -->
					<section class="box text-style1">
						<div class="inner">
							<p>
								<strong>Project:</strong>���� �˾ư��� 5���� �ð�
							</p>
						</div>
					</section>

				

				<!-- Calendar -->
					<section class="box calendar">
						<div class="inner">
							<table>
								<caption>
								<%
								out.print(month+" "+cf.getYear());
								%>
								</caption>
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
										<td><span>6</span></td>
										<td><span>7</span></td>
										<td><span>8</span></td>
										<td><span>9</span></td>
										<td><span>10</span></td>
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
										<td><span>23</span></td>
										<td><span>24</span></td>
									</tr>
									<tr>
										<td><span>25</span></td>
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
						<li>&copy; Project</li><li>����Ʈ���簳�߿� <a><br>����Ʈc��</a></li>
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