<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script src="resources/js/common.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$("#btn").click(function() {
					$.ajax({
						url:"fileDownloadlist.gos",
						type:"GET",
						data:{"gsnum":"SP202307100048"},
						success:whens
					});
					
					function whens(d) {
						var filename = d.split(",");
						for(var i=0; i<filename.length-1; i++) {
							alert(filename[i]);
							$("#divtest1").append("<a href='fileDownload?file="+filename[i]+"&num=SP202307100048' target='_blank'>"+filename[i]+"</a><br><br>");
							
						}
					}
				});
			});
		</script>
	</head>
	
	<body>
	<div id="divtest1">
		<a href="" target="_blank"></a>
	</div>
		<input type="button" id="btn" name="btn" value="test">
	</body>
</html>