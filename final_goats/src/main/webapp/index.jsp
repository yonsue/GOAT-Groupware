<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#loginBtn").click(function(){
					$("#loginForm").attr({
						"action":"login.gos",
						"method":"POST"
					}).submit();
				});
			});
		</script>
		<style type="text/css">
		body{
			background: #2e2e2e;
		}
		.div1{
				background: #fff;
				border: 1px solid #fff;
				width: 300px;
				height: 250px;
				margin: 200px auto;	
			}

		</style>
	</head>
	
	<body>
		<div class="div1">
			<h1 align="center">GOAT.S Login</h1>
			<hr>
			<form name="loginForm" id="loginForm">
				<table border="1" align="center">
					<tr>
						<td><input type="text" name="geid" id="geid" style="width:200px;"></td>
					</tr>
					<tr>
						<td><input type="password" name="gepw" id="gepw" style="width:200px;"></td>
					</tr>
					<tr>
						<td>
							<button type="button" id="loginBtn" style="width:208px; background-color: yellow;">로그인</button>
						</td>
					</tr>
				</table> 
			</form>
		</div>
	</body>
</html>