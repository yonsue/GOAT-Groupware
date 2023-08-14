<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.gt.s.common.DateFormatUtil"%>
<%
	String gsnum = (String) request.getAttribute("gsnum");
String gsname = (String) request.getAttribute("gsname");
String date = DateFormatUtil.documentFormat();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.quilljs.com/1.3.6/quill.snow.css"
	rel="stylesheet">
<script src="https://cdn.quilljs.com/1.3.6/quill.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="resources/js/common.js"></script>
	<script type="text/javascript">
			$(document).ready(function(){
				var gsnum = "<%=gsnum%>";
				var date = "<%=date%>";
				var gsname = "<%=gsname%>";
			$("#gsnum1").text(gsnum);
			$("#date").text(date);
			$("#gsname1").text(gsname);
			
			$("#").keyup(function() {
				
			});
	
			$(document).on("click", "#line12", function() {
				$("#approval").css({
					"visibility" : "visible"
				});
			});
	
			$(document).on("click", "#close", function() {
				window.close();
			});
	
			$(document).on("click", "#sangsin1", function() {
				var app = "";
				var appr = $(".approver");
				for (let i = 0; i < $(".approver").length; i++) {
					app += appr[i].innerHTML + "/";
				}
	
				var dept = "";
				var dept1 = $(".dept");
				for (let i = 0; i < $(".dept").length; i++) {
					dept += dept1[i].innerHTML + "/";
				}
				$("#gsnum").val(gsnum);
				$("#writer").val(gsname);
				$("#reference").val($("#cham").text());
				$("#approver").val(app);
				$("#dept").val(dept);
	
				let dataParam = $("#gbtform").serialize();
				console.log(dataParam);
				$.ajax({
					url : "gtSpendInsert.gos",
					data : dataParam,
					success : function(res) {
						if (res == "OK") {
							alert(res);
							$("#gbt_file_form").attr({
								"action" : "gtSpendFileupload.gos",
								"method" : "POST",
								"enctype" : "multipart/form-data"
							}).submit();
						} else {
							alert("입력 실패");
						}
					},
					error : function(e) {
						console.log(e.responseText);
					}
				});
			});
			
			$(document).on("keyup", ".number", function(){
				var count = $(".count");
				var cost = $(".cost");
				var stcost = $(".stcost");
				var tcost = 0;
				for(let i=0; i<count.length; i++) {
					var stcostval = count[i.toString()].value * cost[i.toString()].value
					tcost += stcostval;
					stcost[i.toString()].innerText = comma(stcostval) + "원";
					if(stcost[i.toString()].innerText == "0원"){
						stcost[i.toString()].innerText = "";
					}
				}
				$("#tcost").text(" ");
				if(tcost > 0){
					$("#tcost").text(comma(tcost) + "원");	
				}
				
			});
		});
	</script>
	<style type="text/css">
	.button-container {
		text-align: right;
	}
	
	.initial-size {
		min-height: 200px;
	}
	
	th {
		background-color: #f2f2f2;
	}
	
	table {
		border-collapse: collapse;
		width: 1000px;
	}
	
	th, td {
		border: 1px solid black;
		padding: 8px;
	}
	
	#date {
		text-align: center;
	}
	
	#approval {
		visibility: hidden;
		position: absolute;
		background-color: #fff;
		width: 100%;
		height: 100%;
		margin: auto;
	}
	</style>
	
	</head>
<body>
	
		<div id="approval">
			<jsp:include page="../approvalline/select.jsp" />
		</div>
		<div class="button-container">
			<input type="button" id="line12" value="결재선지정">
			<input type="button" id="sangsin1" value="상신">
			<input  type="button" id="close" value="취소">
		</div>
		<form id="gbtform">
		<input type="hidden" name="gsnum" id="gsnum" value="">
		<input type="hidden" name="writer" id="writer" value="">
		<input type="hidden" name="approver" id="approver" value=""> 
		<input type="hidden" name="dept" id="dept"> 
		<input type="hidden" name="reference" id="reference" value="">
		<input type="hidden" name="gpnum" id="gpnum" value="">
		<input type="hidden" name="genum" id="gpnum" value="">
		<h2 align="center">지출결의서</h2>
		<br>
		<table>
			<tr>
				<th width="120px">문서번호</th>
				<td width="230px" id="gsnum1"></td>
				<th width="120px">보안구분</th>
				<td width="230px">비공개</td>
				<th width="120px">보존연한</th>
				<td width="230px">5년</td>
			</tr>
			<tr>
				<th width="100px">작성자</th>
				<td width="230px" id="gsname1"></td>
				<th width="100px">작성일자</th>
				<td colspan="3" id="date"></td>
			</tr>
		</table>
		<br>
		<table id="table1">
			<tr>
				<th width="50px">순서</th>
				<th width="80px">구분</th>
				<th width="170px">결재자</th>
				<th width="170px">부서</th>
				<th width="80px">상태</th>
				<th width="100px">결재일</th>
				<th width="350px">결재의견</th>
			</tr>
			<tr>
				<td align="center">1</td>
				<td id="snag1"></td>
				<td id="hu1" class="approver"></td>
				<td id="dept1" class="dept"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td align="center">2</td>
				<td id="snag2"></td>
				<td id="hu2" class="approver"></td>
				<td id="dept2" class="dept"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td align="center">3</td>
				<td id="snag3"></td>
				<td id="hu3" class="approver"></td>
				<td id="dept3" class="dept"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td align="center">4</td>
				<td id="snag4"></td>
				<td id="hu4" class="approver"></td>
				<td id="dept4" class="dept"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td align="center">5</td>
				<td id="snag5"></td>
				<td id="hu5" class="approver"></td>
				<td id="dept5" class="dept"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
		<br>
		<table id="cham1">
			<tr>
				<th width="133px">참 조</th>
				<td id="cham"></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<th width="133px">제 목</th>
				<td><input type="text" name="gssubject" size="100%"></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<th width="15%">프로젝트</th>
				<td>
					<div align="center">
						<button>project</button>
					</div>
				</td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<th width="15%">시행일자</th>
				<td style="align: left;"><input type="date" name="gsdate"></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<th width="120px">구분</th>
				<th width="120px">거래처</th>
				<th width="300px">적요</th>
				<th width="10px">수량</th>
				<th width="20px">단가</th>
				<th width="100px">금액</th>
				<th width="130px">결제방법</th>
			</tr>
			
			<tr>
				<td align="center">
					<!-- 구분 --> <select name="gsgubun" id="gsgubun">
						<option value="-선택-">-선택-</option>
						<option value="소모품">소모품</option>
						<option value="복리후생">복리후생</option>
						<option value="교통비">교통비</option>
						<option value="운반비">운반비</option>
						<option value="보험료">보험료</option>
						<option value="접대비">접대비</option>
						<option value="도서비">도서비</option>
						<option value="수수료">수수료</option>
						<option value="교육훈련비">교육훈련비</option>
						<option value="기타">기타</option>
						<option value="식비">식비</option>
						<option value="숙박비">숙박비</option>
						<option value="제경비">제경비</option>
				</select>
				<td align="center"><input type="text" size="10"
					name="gsaccount"></td>
				<!-- 거래처 -->
				<td align="center"><input type="text" size="30" name="gsinfo number"></td>
				<!-- 적요 -->
				<td align="center"><input type="text" size="5" name="gscount" class="count number"></td>
				<!-- 수량 -->
				<td align="center"><input type="text" size="7" name="gscost" class="cost number"></td>
				<!-- 단가 -->
				<td align="center" class="stcost">
					
				</td>
				<!-- 금액 -->
				<td align="center">법인카드</td>
			</tr>
						<tr>
				<td align="center">
					<!-- 구분 --> <select name="gsgubun" id="gsgubun">
						<option value="-선택-">-선택-</option>
						<option value="소모품">소모품</option>
						<option value="복리후생">복리후생</option>
						<option value="교통비">교통비</option>
						<option value="운반비">운반비</option>
						<option value="보험료">보험료</option>
						<option value="접대비">접대비</option>
						<option value="도서비">도서비</option>
						<option value="수수료">수수료</option>
						<option value="교육훈련비">교육훈련비</option>
						<option value="기타">기타</option>
						<option value="식비">식비</option>
						<option value="숙박비">숙박비</option>
						<option value="제경비">제경비</option>
				</select>
				<td align="center"><input type="text" size="10"
					name="gsaccount"></td>
				<!-- 거래처 -->
				<td align="center"><input type="text" size="30" name="gsinfo number"></td>
				<!-- 적요 -->
				<td align="center"><input type="text" size="5" name="gscount" class="count number"></td>
				<!-- 수량 -->
				<td align="center"><input type="text" size="7" name="gscost" class="cost number"></td>
				<!-- 단가 -->
				<td align="center" class="stcost">
					
				</td>
				<!-- 금액 -->
				<td align="center">법인카드</td>
			</tr>
						<tr>
				<td align="center">
					<!-- 구분 --> <select name="gsgubun" id="gsgubun">
						<option value="-선택-">-선택-</option>
						<option value="소모품">소모품</option>
						<option value="복리후생">복리후생</option>
						<option value="교통비">교통비</option>
						<option value="운반비">운반비</option>
						<option value="보험료">보험료</option>
						<option value="접대비">접대비</option>
						<option value="도서비">도서비</option>
						<option value="수수료">수수료</option>
						<option value="교육훈련비">교육훈련비</option>
						<option value="기타">기타</option>
						<option value="식비">식비</option>
						<option value="숙박비">숙박비</option>
						<option value="제경비">제경비</option>
				</select>
				<td align="center"><input type="text" size="10"
					name="gsaccount"></td>
				<!-- 거래처 -->
				<td align="center"><input type="text" size="30" name="gsinfo number"></td>
				<!-- 적요 -->
				<td align="center"><input type="text" size="5" name="gscount" class="count number"></td>
				<!-- 수량 -->
				<td align="center"><input type="text" size="7" name="gscost" class="cost number"></td>
				<!-- 단가 -->
				<td align="center" class="stcost">
					
				</td>
				<!-- 금액 -->
				<td align="center">법인카드</td>
			</tr>
						<tr>
				<td align="center">
					<!-- 구분 --> <select name="gsgubun" id="gsgubun">
						<option value="-선택-">-선택-</option>
						<option value="소모품">소모품</option>
						<option value="복리후생">복리후생</option>
						<option value="교통비">교통비</option>
						<option value="운반비">운반비</option>
						<option value="보험료">보험료</option>
						<option value="접대비">접대비</option>
						<option value="도서비">도서비</option>
						<option value="수수료">수수료</option>
						<option value="교육훈련비">교육훈련비</option>
						<option value="기타">기타</option>
						<option value="식비">식비</option>
						<option value="숙박비">숙박비</option>
						<option value="제경비">제경비</option>
				</select>
				<td align="center"><input type="text" size="10"
					name="gsaccount"></td>
				<!-- 거래처 -->
				<td align="center"><input type="text" size="30" name="gsinfo number"></td>
				<!-- 적요 -->
				<td align="center"><input type="text" size="5" name="gscount" class="count number"></td>
				<!-- 수량 -->
				<td align="center"><input type="text" size="7" name="gscost" class="cost number"></td>
				<!-- 단가 -->
				<td align="center" class="stcost">
					
				</td>
				<!-- 금액 -->
				<td align="center">법인카드</td>
			</tr>
						<tr>
				<td align="center">
					<!-- 구분 --> <select name="gsgubun" id="gsgubun">
						<option value="-선택-">-선택-</option>
						<option value="소모품">소모품</option>
						<option value="복리후생">복리후생</option>
						<option value="교통비">교통비</option>
						<option value="운반비">운반비</option>
						<option value="보험료">보험료</option>
						<option value="접대비">접대비</option>
						<option value="도서비">도서비</option>
						<option value="수수료">수수료</option>
						<option value="교육훈련비">교육훈련비</option>
						<option value="기타">기타</option>
						<option value="식비">식비</option>
						<option value="숙박비">숙박비</option>
						<option value="제경비">제경비</option>
				</select>
				<td align="center"><input type="text" size="10"
					name="gsaccount"></td>
				<!-- 거래처 -->
				<td align="center"><input type="text" size="30" name="gsinfo number"></td>
				<!-- 적요 -->
				<td align="center"><input type="text" size="5" name="gscount" class="count number"></td>
				<!-- 수량 -->
				<td align="center"><input type="text" size="7" name="gscost" class="cost number"></td>
				<!-- 단가 -->
				<td align="center" class="stcost">
					
				</td>
				<!-- 금액 -->
				<td align="center">법인카드</td>
			</tr>
			<tr>
				<td colspan="3"
					style='text-align: center; background-color: #f2f2f2; font-weight: bold;'
					width="475px">합 계</td>
				<td colspan="3" style='text-align: center;' width="475px" id="tcost"></td>
				<th width="50px"></th>
			</tr>
		</table>
		<br>
	</form>
	<form id="gbt_file_form">
		<table>
			<tr>
				<th width="120px">첨부파일</th>
				<td><input type="file" name="gsfile" size="100%" multiple="multiple"></td>
			</tr>
		</table>
 <br>
	</form>
</body>
</html>