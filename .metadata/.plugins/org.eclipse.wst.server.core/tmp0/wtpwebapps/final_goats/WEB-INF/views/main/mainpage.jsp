<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.gt.s.kos.schedule.vo.GtScheduleVO" %>
<%@ page import="org.apache.log4j.LogManager" %>  
<%@ page import="org.apache.log4j.Logger" %>  

<%
     Logger log = LogManager.getLogger(this.getClass());
     log.info("mainpage.jsp");
  %>  
<%

     Object objVa = request.getAttribute("listVa");
     List<GtScheduleVO> listVa = (List<GtScheduleVO>)objVa;
     
     String selectday = (String)request.getAttribute("selectday");
     log.info("메인으로 돌아와서 selectday >>> :  "  + selectday);
     
  //    int vCnt = listVa.size();
     
  //    log.info("listVa.size() >>> : " + listVa.size());
  %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <script
      type="text/javascript"
      src="https://code.jquery.com/jquery-1.11.0.min.js"
    ></script>
    <script>
    window.onload = function () {
        buildCalendar();
        highlightTextCells();
      }; // 웹 페이지가 로드되면 buildCalendar 실행

      let nowMonth = new Date(); // 현재 달을 페이지를 로드한 날의 달로 초기화
      let today = new Date(); // 페이지를 로드한 날짜를 저장
      today.setHours(0, 0, 0, 0); // 비교 편의를 위해 today의 시간을 초기화

      // 달력 생성 : 해당 달에 맞춰 테이블을 만들고, 날짜를 채워 넣는다.
      function buildCalendar() {
        let firstDate = new Date(
          nowMonth.getFullYear(),
          nowMonth.getMonth(),
          1
        ); // 이번달 1일
        let lastDate = new Date(
          nowMonth.getFullYear(),
          nowMonth.getMonth() + 1,
          0
        ); // 이번달 마지막날

        let tbody_Calendar = document.querySelector(".Calendar > tbody");
        document.getElementById("calYear").innerText = nowMonth.getFullYear(); // 연도 숫자 갱신
        document.getElementById("calMonth").innerText = leftPad(
          nowMonth.getMonth() + 1
        ); // 월 숫자 갱신

        while (tbody_Calendar.rows.length > 0) {
          // 이전 출력결과가 남아있는 경우 초기화
          tbody_Calendar.deleteRow(tbody_Calendar.rows.length - 1);
        }

        let nowRow = tbody_Calendar.insertRow(); // 첫번째 행 추가

        for (let j = 0; j < firstDate.getDay(); j++) {
          // 이번달 1일의 요일만큼
          let nowColumn = nowRow.insertCell(); // 열 추가
        }

        for (
          let nowDay = firstDate;
          nowDay <= lastDate;
          nowDay.setDate(nowDay.getDate() + 1)
        ) {
          // day는 날짜를 저장하는 변수, 이번달 마지막날까지 증가시키며 반복

          let nowColumn = nowRow.insertCell(); // 새 열을 추가하고
          nowColumn.innerText = leftPad(nowDay.getDate()); // 추가한 열에 날짜 입력

          if (nowDay.getDay() == 0) {
            // 일요일인 경우 글자색 빨강으로
            nowColumn.style.color = "#DC143C";
          }
          if (nowDay.getDay() == 6) {
            // 토요일인 경우 글자색 파랑으로 하고
            nowColumn.style.color = "#0000CD";
            nowRow = tbody_Calendar.insertRow(); // 새로운 행 추가
          }

          if (nowDay < today) {                       // 지난날인 경우
              nowColumn.className = "pastDay";
          }
          
          if (
            nowDay.getFullYear() == today.getFullYear() &&
            nowDay.getMonth() == today.getMonth() &&
            nowDay.getDate() == today.getDate()
          ) {
            // 오늘인 경우
            nowColumn.className = "today";
            nowColumn.onclick = function () {
              choiceDate(this);
            };
          } else {
            // 미래인 경우
            nowColumn.className = "futureDay";
            nowColumn.onclick = function () {
              choiceDate(this);
            };
          }
        }
      }

      // 이전달 버튼 클릭
      function prevCalendar() {
        nowMonth = new Date(
          nowMonth.getFullYear(),
          nowMonth.getMonth() - 1,
          nowMonth.getDate()
        ); // 현재 달을 1 감소
        buildCalendar(); // 달력 다시 생성
      }
      
   // 다음달 버튼 클릭
      function nextCalendar() {
        nowMonth = new Date(
          nowMonth.getFullYear(),
          nowMonth.getMonth() + 1,
          nowMonth.getDate()
        ); // 현재 달을 1 증가
        buildCalendar(); // 달력 다시 생성
      }

      // input값이 한자리 숫자인 경우 앞에 '0' 붙혀주는 함수
      function leftPad(value) {
        if (value < 10) {
          value = "0" + value;
          return value;
        }
        return value;
      }
      
      // 날짜 선택
      function choiceDate(nowColumn) {
        if (document.getElementsByClassName("choiceDay")[0]) {
          // 기존에 선택한 날짜가 있으면
          document
            .getElementsByClassName("choiceDay")[0]
            .classList.remove("choiceDay"); // 해당 날짜의 "choiceDay" class 제거
        }
        nowColumn.classList.add("choiceDay"); // 선택된 날짜에 "choiceDay" class 추가
        alert(
          "choiceDay >>>> : " +
            document.getElementsByClassName("choiceDay")[0].innerText
        );
        let dd = document.getElementsByClassName("choiceDay")[0].innerText;
        let yy = document.getElementById("calYear").innerText; // 연도 숫자 갱신
        let mm = document.getElementById("calMonth").innerText; // 월 숫자 갱신
        document.getElementById('selectday').value = dd;
        alert("yy >>> : " + yy);
        alert("mm >>> : " + mm);
        var yymmdd = yy + "-" + mm + "-" + dd;
        alert("yymmdd >>> : " + yymmdd);
        
        let Surl = "gtScheduleSelect.gos";
         
        // 컨트롤러로 데이터 조회하러 가자
        if (yymmdd != null) {
           
           document.getElementById('gpstart').value = yymmdd;
            
              $('#hiddenform').attr({
                  'action':'gtScheduleSelect.gos',
                  'method':'POST',
                  'enctype':'application/x-www-form-urlencoded'
               }).submit();
           
           }
        
          
        } // end of 날짜 선택
        
        
        function highlightTextCells() {
             var table = document.getElementById("Calendar");
             var rows = table.getElementsByTagName("tr");
             var sday = /<%=selectday%>/;

             for (var i = 0; i < rows.length; i++) {
               var row = rows[i];
               var cells = row.getElementsByTagName("td");

               // 첫 번째 행은 건너뛰도록 조건을 추가합니다.
               if (i === 0) {
                 continue;
               }

               for (var j = 0; j < cells.length; j++) {
                 var cell = cells[j];
                 if (sday.test(cell.innerText)) {
                   cell.classList.add("highlight");
                 }
               }
             }
           }

        
      
      
      $(document).ready(function () {

         <%if(listVa != null){
            for(int i = 0; i < listVa.size(); i++){
            GtScheduleVO svoVa = listVa.get(i);%>        
               $("#mytable").append("<tr><td><%= svoVa.getGename() %></td>"
                      + "<td><%= svoVa.getGvtype() %></td>"
                      + "<td><%= svoVa.getGpstart() %></td>"
                      + "<td><%= svoVa.getGpend() %></td>"
                      + "</tr>");
         <%        
               } 
         }
         %>
        
       
        
      }); // end of ready
    </script>
    <style>
       body{
          margin:0 auto;
          
       }
      #mytable {
        background-color: white;
      }

      #rightcon {
        width: 100%;
      }

      table {
        width: 100%;
        border-collapse: collapse;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
      }

      tr td {
        border: 1px solid gray;
      }

      #noticet tr:first-child {
        background-color: #333333;
        color: #ffffff;
        font-weight: bold;
      }

      #projectt tr:first-child {
        background-color: #666666;
        color: #ffffff;
        font-weight: bold;
      }

      #noticet td {
        border: 1px solid black;
        padding: 5px;
      }

      #projectt td {
        border: 1px solid black;
        padding: 5px;
      }

      td {
        width: 65px;
        height: 25px;
      }

      .Calendar {
        text-align: center;
        margin: 0 auto;
      }

      .Calendar > thead > tr:first-child > td {
        font-weight: bold;
      }

      .Calendar > thead > tr:last-child > td {
        background-color: gray;
        color: white;
      }

      .pastDay {
        background-color: lightgray;
      }

      .today {
        background-color: #ffca64;
        cursor: pointer;
      }

      .futureDay {
        background-color: #ffffff;
        cursor: pointer;
      }

      .futureDay.choiceDay,
      .today.choiceDay {
        background-color: #3e85ef;
        color: #fff;
        cursor: pointer;
      }

      body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
      }

      .container2 {
        display: flex;
      }

      .container {
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        height: 951px;
        width: 100%;
      }

      .container > div {
        padding: 20px;
        background-color: #fff;
        border: 1px solid #ccc;
        height: 100%;
      }

      .container h3 {
        margin: 0;
        padding: 10px 0;
        font-size: 18px;
        font-weight: bold;
      }

      .calendar {
        height: 200px;
      }

      .notice table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 10px;
      }

      .notice th,
      .notice td {
        padding: 10px;
        text-align: left;
      }

      .notice th {
        background-color: #f0f0f0;
      }

      .work {
        height: 300px;
      }
      .sec {
        background-color: lightblue;
      }
       .highlight {
         background-color: lightblue;
         font-weight: bold;
       }
       
       table, tr{
       	text-align:center;
       }
    </style>
  </head>
  <body style="width:100%">
     <form id="hiddenform">
        <input type="hidden" id="gpstart" name="gpstart">
        <input type="hidden" id="selectday" name="selectday">
     </form>
    <div class="container2" style="margin: 0">
      <div>
        <jsp:include page="mainSide-bar.jsp" />
      </div>
      <div style="margin: 0; padding: 0; width:100%">
        <jsp:include page="Top-bar.jsp"></jsp:include>
        <div class="container" id="rightcon">
          <div
            class="calendar"
            style="background-color: whitesmoke; height: auto; width:100%">
            <table id="Calendar" class="Calendar">
              <thead>
                <tr>
                  <td onClick="prevCalendar();" style="cursor: pointer">
                    &#60;
                  </td>
                  <td class="yymm" colspan="5">
                    <span id="calYear"></span>년 <span id="calMonth"></span>월
                  </td>
                  <td onClick="nextCalendar();" style="cursor: pointer">
                    &#62;
                  </td>
                </tr>
                <tr>
                  <td>일</td>
                  <td>월</td>
                  <td>화</td>
                  <td>수</td>
                  <td>목</td>
                  <td>금</td>
                  <td>토</td>
                </tr>
              </thead>

              <tbody></tbody>
            </table>
          </div>
          <div
            class="notice"
            style="background-color: whitesmoke; height: auto; width: 100%"
          >
            <table id="noticet">
              <tr>
                <td colspan="2">공지사항</td>
              </tr>
            </table>
            <table id="projectt">
              <tr>
                <td colspan="2">프로젝트</td>
              </tr>
            </table>
          </div>
          <div
            class="work"
            style="background-color: whitesmoke; height: auto; width: 100%">
            <table id="mytable" class="vat">
              <tr style="text-align:center;">
                <td colspan="4" class="sec" >휴가 일정</td>
              </tr>
              <tr >
                <td class="sec">이름</td>
                <td class="sec">구분</td>
                <td class="sec">시작일자</td>
                <td class="sec">종료일자</td>
              </tr>
            </table>
            <hr/>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>