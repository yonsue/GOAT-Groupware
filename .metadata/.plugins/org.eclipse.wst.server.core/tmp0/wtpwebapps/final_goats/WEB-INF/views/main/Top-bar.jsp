<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		    <script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
		    <script src="resources/js/common.js"></script>
		<script type="text/javascript">
		
			function logout(){
				location.href="logout.gos";
			}
			$(document).ready(function(){
				
			$(function(){
				// 현재 시간 
				function printTime(){
					let days = ["일", "월", "화", "수", "목", "금", "토"];
					let md = new Date();
					
					let yy = md.getFullYear();
					let mm = md.getMonth() + 1;
					let dd = md.getDate();
					let ii = md.getDay();
					let di = days[ii];
					let hh = md.getHours();
					let mi = md.getMinutes();
					let ss = md.getSeconds();
					
					let time = 	yy + "년 " +
								numpad(mm) + "월 " +
								numpad(dd) + "일 " +
								di + "요일 " +
								numpad(hh) + ":" +
								numpad(mi) + ":" +
								numpad(ss);
					document.getElementById("timer").innerHTML=time;
				}
				setInterval(printTime, 1000);
			});

		});
		</script>
		<style type="text/css">
		h2 {
        margin: 0;
        padding: 10px 0;
        text-align: center;
        color: #337ab7;
     	}
     	.topdiv{
/* 		margin:0; */
		padding:0;
		}
		.topdiv{
        	background-color: #fff;
        	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        	height:60px;
        	min-width:100%;
		}
		</style>
		
	</head>
	
	<body>
		<div class="topdiv">
		<div style="text-align:right;"></div>
		<div style="text-align:right; padding:10px;"><span id="timer" style="padding:10px 30px;"> </span>
			<a href="javascript:logout()"><img src="resources/goats_icon/logout.png" style="width:30px; height:30px"></a>
		</div>
		</div>
	</body>
</html>