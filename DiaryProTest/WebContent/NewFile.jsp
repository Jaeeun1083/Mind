<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.css"/>
<script src="https://d3js.org/d3.v3.min.js"></script>     
<script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.js"></script>
</head>
<body>
<div id="chart"></div>
<%
ArrayList<Integer> arr1 = new ArrayList<Integer>();
ArrayList<Integer> arr = new ArrayList<Integer>();
Random rd = new Random();

int n1 = rd.nextInt(20);

for(int i=1; i<=10; i++ ) {
	arr.add(i);
}

for(int i=1; i<=10; i++ ) {
	arr1.add(n1);
}

for (int i = 0; i < arr1.size(); i++) {
	out.print(arr1.get(i));
} %>


<script type="text/javascript">
var chart = c3.generate({
    data: {
        x: 'x',
       
//        xFormat: '%Y%m%d', // 'xFormat' can be used as custom format of 'x'
        columns: [
//			 ['',]
            ['x', '2013-01-01', '2013-01-02', '2013-01-03', '2013-01-04', '2013-01-05', '2013-01-06'],//x축 
//            ['x', '20130101', '20130102', '20130103', '20130104', '20130105', '20130106'],
            ['점수', <%for(int i = 0; i < arr1.size(); i++) {
							out.print(arr.get(i)+",");}%>],//y축값
            ['data2', 130, 340, 200, 500, 250, 350]
        ]
    },
    axis: {
        x: {
            type: 'timeseries',
            tick: {
              format: '%Y/%m/%d'
            }
        }
    }
});

setTimeout(function () {
    chart.load({
        columns: [
            ['data3', 400, 500, 450, 700, 600, 500]
        ]
    });
}, 1000);
</script>
<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</body>
</html>