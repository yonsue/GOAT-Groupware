/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-07-12 07:37:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import com.gt.s.kos.schedule.vo.GtScheduleVO;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.log4j.Logger");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.gt.s.kos.schedule.vo.GtScheduleVO");
    _jspx_imports_classes.add("org.apache.log4j.LogManager");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");

     Logger log = LogManager.getLogger(this.getClass());
     log.info("mainpage.jsp");
  
      out.write("  \r\n");


     Object objVa = request.getAttribute("listVa");
     List<GtScheduleVO> listVa = (List<GtScheduleVO>)objVa;
     
     String selectday = (String)request.getAttribute("selectday");
     log.info("메인으로 돌아와서 selectday >>> :  "  + selectday);
     
  //    int vCnt = listVa.size();
     
  //    log.info("listVa.size() >>> : " + listVa.size());
  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <script\r\n");
      out.write("      type=\"text/javascript\"\r\n");
      out.write("      src=\"https://code.jquery.com/jquery-1.11.0.min.js\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    window.onload = function () {\r\n");
      out.write("        buildCalendar();\r\n");
      out.write("        highlightTextCells();\r\n");
      out.write("      }; // 웹 페이지가 로드되면 buildCalendar 실행\r\n");
      out.write("\r\n");
      out.write("      let nowMonth = new Date(); // 현재 달을 페이지를 로드한 날의 달로 초기화\r\n");
      out.write("      let today = new Date(); // 페이지를 로드한 날짜를 저장\r\n");
      out.write("      today.setHours(0, 0, 0, 0); // 비교 편의를 위해 today의 시간을 초기화\r\n");
      out.write("\r\n");
      out.write("      // 달력 생성 : 해당 달에 맞춰 테이블을 만들고, 날짜를 채워 넣는다.\r\n");
      out.write("      function buildCalendar() {\r\n");
      out.write("        let firstDate = new Date(\r\n");
      out.write("          nowMonth.getFullYear(),\r\n");
      out.write("          nowMonth.getMonth(),\r\n");
      out.write("          1\r\n");
      out.write("        ); // 이번달 1일\r\n");
      out.write("        let lastDate = new Date(\r\n");
      out.write("          nowMonth.getFullYear(),\r\n");
      out.write("          nowMonth.getMonth() + 1,\r\n");
      out.write("          0\r\n");
      out.write("        ); // 이번달 마지막날\r\n");
      out.write("\r\n");
      out.write("        let tbody_Calendar = document.querySelector(\".Calendar > tbody\");\r\n");
      out.write("        document.getElementById(\"calYear\").innerText = nowMonth.getFullYear(); // 연도 숫자 갱신\r\n");
      out.write("        document.getElementById(\"calMonth\").innerText = leftPad(\r\n");
      out.write("          nowMonth.getMonth() + 1\r\n");
      out.write("        ); // 월 숫자 갱신\r\n");
      out.write("\r\n");
      out.write("        while (tbody_Calendar.rows.length > 0) {\r\n");
      out.write("          // 이전 출력결과가 남아있는 경우 초기화\r\n");
      out.write("          tbody_Calendar.deleteRow(tbody_Calendar.rows.length - 1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        let nowRow = tbody_Calendar.insertRow(); // 첫번째 행 추가\r\n");
      out.write("\r\n");
      out.write("        for (let j = 0; j < firstDate.getDay(); j++) {\r\n");
      out.write("          // 이번달 1일의 요일만큼\r\n");
      out.write("          let nowColumn = nowRow.insertCell(); // 열 추가\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        for (\r\n");
      out.write("          let nowDay = firstDate;\r\n");
      out.write("          nowDay <= lastDate;\r\n");
      out.write("          nowDay.setDate(nowDay.getDate() + 1)\r\n");
      out.write("        ) {\r\n");
      out.write("          // day는 날짜를 저장하는 변수, 이번달 마지막날까지 증가시키며 반복\r\n");
      out.write("\r\n");
      out.write("          let nowColumn = nowRow.insertCell(); // 새 열을 추가하고\r\n");
      out.write("          nowColumn.innerText = leftPad(nowDay.getDate()); // 추가한 열에 날짜 입력\r\n");
      out.write("\r\n");
      out.write("          if (nowDay.getDay() == 0) {\r\n");
      out.write("            // 일요일인 경우 글자색 빨강으로\r\n");
      out.write("            nowColumn.style.color = \"#DC143C\";\r\n");
      out.write("          }\r\n");
      out.write("          if (nowDay.getDay() == 6) {\r\n");
      out.write("            // 토요일인 경우 글자색 파랑으로 하고\r\n");
      out.write("            nowColumn.style.color = \"#0000CD\";\r\n");
      out.write("            nowRow = tbody_Calendar.insertRow(); // 새로운 행 추가\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if (nowDay < today) {                       // 지난날인 경우\r\n");
      out.write("              nowColumn.className = \"pastDay\";\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          if (\r\n");
      out.write("            nowDay.getFullYear() == today.getFullYear() &&\r\n");
      out.write("            nowDay.getMonth() == today.getMonth() &&\r\n");
      out.write("            nowDay.getDate() == today.getDate()\r\n");
      out.write("          ) {\r\n");
      out.write("            // 오늘인 경우\r\n");
      out.write("            nowColumn.className = \"today\";\r\n");
      out.write("            nowColumn.onclick = function () {\r\n");
      out.write("              choiceDate(this);\r\n");
      out.write("            };\r\n");
      out.write("          } else {\r\n");
      out.write("            // 미래인 경우\r\n");
      out.write("            nowColumn.className = \"futureDay\";\r\n");
      out.write("            nowColumn.onclick = function () {\r\n");
      out.write("              choiceDate(this);\r\n");
      out.write("            };\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      // 이전달 버튼 클릭\r\n");
      out.write("      function prevCalendar() {\r\n");
      out.write("        nowMonth = new Date(\r\n");
      out.write("          nowMonth.getFullYear(),\r\n");
      out.write("          nowMonth.getMonth() - 1,\r\n");
      out.write("          nowMonth.getDate()\r\n");
      out.write("        ); // 현재 달을 1 감소\r\n");
      out.write("        buildCalendar(); // 달력 다시 생성\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("   // 다음달 버튼 클릭\r\n");
      out.write("      function nextCalendar() {\r\n");
      out.write("        nowMonth = new Date(\r\n");
      out.write("          nowMonth.getFullYear(),\r\n");
      out.write("          nowMonth.getMonth() + 1,\r\n");
      out.write("          nowMonth.getDate()\r\n");
      out.write("        ); // 현재 달을 1 증가\r\n");
      out.write("        buildCalendar(); // 달력 다시 생성\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      // input값이 한자리 숫자인 경우 앞에 '0' 붙혀주는 함수\r\n");
      out.write("      function leftPad(value) {\r\n");
      out.write("        if (value < 10) {\r\n");
      out.write("          value = \"0\" + value;\r\n");
      out.write("          return value;\r\n");
      out.write("        }\r\n");
      out.write("        return value;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      // 날짜 선택\r\n");
      out.write("      function choiceDate(nowColumn) {\r\n");
      out.write("        if (document.getElementsByClassName(\"choiceDay\")[0]) {\r\n");
      out.write("          // 기존에 선택한 날짜가 있으면\r\n");
      out.write("          document\r\n");
      out.write("            .getElementsByClassName(\"choiceDay\")[0]\r\n");
      out.write("            .classList.remove(\"choiceDay\"); // 해당 날짜의 \"choiceDay\" class 제거\r\n");
      out.write("        }\r\n");
      out.write("        nowColumn.classList.add(\"choiceDay\"); // 선택된 날짜에 \"choiceDay\" class 추가\r\n");
      out.write("        alert(\r\n");
      out.write("          \"choiceDay >>>> : \" +\r\n");
      out.write("            document.getElementsByClassName(\"choiceDay\")[0].innerText\r\n");
      out.write("        );\r\n");
      out.write("        let dd = document.getElementsByClassName(\"choiceDay\")[0].innerText;\r\n");
      out.write("        let yy = document.getElementById(\"calYear\").innerText; // 연도 숫자 갱신\r\n");
      out.write("        let mm = document.getElementById(\"calMonth\").innerText; // 월 숫자 갱신\r\n");
      out.write("        document.getElementById('selectday').value = dd;\r\n");
      out.write("        alert(\"yy >>> : \" + yy);\r\n");
      out.write("        alert(\"mm >>> : \" + mm);\r\n");
      out.write("        var yymmdd = yy + \"-\" + mm + \"-\" + dd;\r\n");
      out.write("        alert(\"yymmdd >>> : \" + yymmdd);\r\n");
      out.write("        \r\n");
      out.write("        let Surl = \"gtScheduleSelect.gos\";\r\n");
      out.write("         \r\n");
      out.write("        // 컨트롤러로 데이터 조회하러 가자\r\n");
      out.write("        if (yymmdd != null) {\r\n");
      out.write("           \r\n");
      out.write("           document.getElementById('gpstart').value = yymmdd;\r\n");
      out.write("            \r\n");
      out.write("              $('#hiddenform').attr({\r\n");
      out.write("                  'action':'gtScheduleSelect.gos',\r\n");
      out.write("                  'method':'POST',\r\n");
      out.write("                  'enctype':'application/x-www-form-urlencoded'\r\n");
      out.write("               }).submit();\r\n");
      out.write("           \r\n");
      out.write("           }\r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("        } // end of 날짜 선택\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        function highlightTextCells() {\r\n");
      out.write("             var table = document.getElementById(\"Calendar\");\r\n");
      out.write("             var rows = table.getElementsByTagName(\"tr\");\r\n");
      out.write("             var sday = /");
      out.print(selectday);
      out.write("/;\r\n");
      out.write("\r\n");
      out.write("             for (var i = 0; i < rows.length; i++) {\r\n");
      out.write("               var row = rows[i];\r\n");
      out.write("               var cells = row.getElementsByTagName(\"td\");\r\n");
      out.write("\r\n");
      out.write("               // 첫 번째 행은 건너뛰도록 조건을 추가합니다.\r\n");
      out.write("               if (i === 0) {\r\n");
      out.write("                 continue;\r\n");
      out.write("               }\r\n");
      out.write("\r\n");
      out.write("               for (var j = 0; j < cells.length; j++) {\r\n");
      out.write("                 var cell = cells[j];\r\n");
      out.write("                 if (sday.test(cell.innerText)) {\r\n");
      out.write("                   cell.classList.add(\"highlight\");\r\n");
      out.write("                 }\r\n");
      out.write("               }\r\n");
      out.write("             }\r\n");
      out.write("           }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("         ");
if(listVa != null){
            for(int i = 0; i < listVa.size(); i++){
            GtScheduleVO svoVa = listVa.get(i);
      out.write("        \r\n");
      out.write("               $(\"#mytable\").append(\"<tr><td>");
      out.print( svoVa.getGename() );
      out.write("</td>\"\r\n");
      out.write("                      + \"<td>");
      out.print( svoVa.getGvtype() );
      out.write("</td>\"\r\n");
      out.write("                      + \"<td>");
      out.print( svoVa.getGpstart() );
      out.write("</td>\"\r\n");
      out.write("                      + \"<td>");
      out.print( svoVa.getGpend() );
      out.write("</td>\"\r\n");
      out.write("                      + \"</tr>\");\r\n");
      out.write("         ");
        
               } 
         }
         
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("      }); // end of ready\r\n");
      out.write("    </script>\r\n");
      out.write("    <style>\r\n");
      out.write("       body{\r\n");
      out.write("          margin:0 auto;\r\n");
      out.write("          \r\n");
      out.write("       }\r\n");
      out.write("      #mytable {\r\n");
      out.write("        background-color: white;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #rightcon {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      table {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        border-collapse: collapse;\r\n");
      out.write("        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      tr td {\r\n");
      out.write("        border: 1px solid gray;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #noticet tr:first-child {\r\n");
      out.write("        background-color: #333333;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #projectt tr:first-child {\r\n");
      out.write("        background-color: #666666;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #noticet td {\r\n");
      out.write("        border: 1px solid black;\r\n");
      out.write("        padding: 5px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #projectt td {\r\n");
      out.write("        border: 1px solid black;\r\n");
      out.write("        padding: 5px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      td {\r\n");
      out.write("        width: 65px;\r\n");
      out.write("        height: 25px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .Calendar {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .Calendar > thead > tr:first-child > td {\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .Calendar > thead > tr:last-child > td {\r\n");
      out.write("        background-color: gray;\r\n");
      out.write("        color: white;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .pastDay {\r\n");
      out.write("        background-color: lightgray;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .today {\r\n");
      out.write("        background-color: #ffca64;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .futureDay {\r\n");
      out.write("        background-color: #ffffff;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .futureDay.choiceDay,\r\n");
      out.write("      .today.choiceDay {\r\n");
      out.write("        background-color: #3e85ef;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      body {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        font-family: Arial, sans-serif;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container2 {\r\n");
      out.write("        display: flex;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: row;\r\n");
      out.write("        justify-content: space-between;\r\n");
      out.write("        height: 951px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container > div {\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container h3 {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 10px 0;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .calendar {\r\n");
      out.write("        height: 200px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .notice table {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        border-collapse: collapse;\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .notice th,\r\n");
      out.write("      .notice td {\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .notice th {\r\n");
      out.write("        background-color: #f0f0f0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .work {\r\n");
      out.write("        height: 300px;\r\n");
      out.write("      }\r\n");
      out.write("      .sec {\r\n");
      out.write("        background-color: lightblue;\r\n");
      out.write("      }\r\n");
      out.write("       .highlight {\r\n");
      out.write("         background-color: lightblue;\r\n");
      out.write("         font-weight: bold;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       table, tr{\r\n");
      out.write("       	text-align:center;\r\n");
      out.write("       }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body style=\"width:100%\">\r\n");
      out.write("     <form id=\"hiddenform\">\r\n");
      out.write("        <input type=\"hidden\" id=\"gpstart\" name=\"gpstart\">\r\n");
      out.write("        <input type=\"hidden\" id=\"selectday\" name=\"selectday\">\r\n");
      out.write("     </form>\r\n");
      out.write("    <div class=\"container2\" style=\"margin: 0\">\r\n");
      out.write("      <div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mainSide-bar.jsp", out, false);
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <div style=\"margin: 0; padding: 0; width:100%\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Top-bar.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"container\" id=\"rightcon\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"calendar\"\r\n");
      out.write("            style=\"background-color: whitesmoke; height: auto; width:100%\">\r\n");
      out.write("            <table id=\"Calendar\" class=\"Calendar\">\r\n");
      out.write("              <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td onClick=\"prevCalendar();\" style=\"cursor: pointer\">\r\n");
      out.write("                    &#60;\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td class=\"yymm\" colspan=\"5\">\r\n");
      out.write("                    <span id=\"calYear\"></span>년 <span id=\"calMonth\"></span>월\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td onClick=\"nextCalendar();\" style=\"cursor: pointer\">\r\n");
      out.write("                    &#62;\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>일</td>\r\n");
      out.write("                  <td>월</td>\r\n");
      out.write("                  <td>화</td>\r\n");
      out.write("                  <td>수</td>\r\n");
      out.write("                  <td>목</td>\r\n");
      out.write("                  <td>금</td>\r\n");
      out.write("                  <td>토</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("\r\n");
      out.write("              <tbody></tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"notice\"\r\n");
      out.write("            style=\"background-color: whitesmoke; height: auto; width: 100%\"\r\n");
      out.write("          >\r\n");
      out.write("            <table id=\"noticet\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"2\">공지사항</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table id=\"projectt\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"2\">프로젝트</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"work\"\r\n");
      out.write("            style=\"background-color: whitesmoke; height: auto; width: 100%\">\r\n");
      out.write("            <table id=\"mytable\" class=\"vat\">\r\n");
      out.write("              <tr style=\"text-align:center;\">\r\n");
      out.write("                <td colspan=\"4\" class=\"sec\" >휴가 일정</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr >\r\n");
      out.write("                <td class=\"sec\">이름</td>\r\n");
      out.write("                <td class=\"sec\">구분</td>\r\n");
      out.write("                <td class=\"sec\">시작일자</td>\r\n");
      out.write("                <td class=\"sec\">종료일자</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <hr/>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}