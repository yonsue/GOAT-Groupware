/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-07-12 05:46:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.spend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gt.s.common.DateFormatUtil;

public final class spendinsertForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.gt.s.common.DateFormatUtil");
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

	String gsnum = (String) request.getAttribute("gsnum");
String gsname = (String) request.getAttribute("gsname");
String date = DateFormatUtil.documentFormat();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.quilljs.com/1.3.6/quill.snow.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.quilljs.com/1.3.6/quill.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script src=\"resources/js/common.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("			$(document).ready(function(){\r\n");
      out.write("				var gsnum = \"");
      out.print(gsnum);
      out.write("\";\r\n");
      out.write("				var date = \"");
      out.print(date);
      out.write("\";\r\n");
      out.write("				var gsname = \"");
      out.print(gsname);
      out.write("\";\r\n");
      out.write("			$(\"#gsnum1\").text(gsnum);\r\n");
      out.write("			$(\"#date\").text(date);\r\n");
      out.write("			$(\"#gsname1\").text(gsname);\r\n");
      out.write("			\r\n");
      out.write("			$(\"#\").keyup(function() {\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("	\r\n");
      out.write("			$(document).on(\"click\", \"#line12\", function() {\r\n");
      out.write("				$(\"#approval\").css({\r\n");
      out.write("					\"visibility\" : \"visible\"\r\n");
      out.write("				});\r\n");
      out.write("			});\r\n");
      out.write("	\r\n");
      out.write("			$(document).on(\"click\", \"#close\", function() {\r\n");
      out.write("				window.close();\r\n");
      out.write("			});\r\n");
      out.write("	\r\n");
      out.write("			$(document).on(\"click\", \"#sangsin1\", function() {\r\n");
      out.write("				var app = \"\";\r\n");
      out.write("				var appr = $(\".approver\");\r\n");
      out.write("				for (let i = 0; i < $(\".approver\").length; i++) {\r\n");
      out.write("					app += appr[i].innerHTML + \"/\";\r\n");
      out.write("				}\r\n");
      out.write("	\r\n");
      out.write("				var dept = \"\";\r\n");
      out.write("				var dept1 = $(\".dept\");\r\n");
      out.write("				for (let i = 0; i < $(\".dept\").length; i++) {\r\n");
      out.write("					dept += dept1[i].innerHTML + \"/\";\r\n");
      out.write("				}\r\n");
      out.write("				$(\"#gsnum\").val(gsnum);\r\n");
      out.write("				$(\"#writer\").val(gsname);\r\n");
      out.write("				$(\"#reference\").val($(\"#cham\").text());\r\n");
      out.write("				$(\"#approver\").val(app);\r\n");
      out.write("				$(\"#dept\").val(dept);\r\n");
      out.write("	\r\n");
      out.write("				let dataParam = $(\"#gbtform\").serialize();\r\n");
      out.write("				console.log(dataParam);\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url : \"gtSpendInsert.gos\",\r\n");
      out.write("					data : dataParam,\r\n");
      out.write("					success : function(res) {\r\n");
      out.write("						if (res == \"OK\") {\r\n");
      out.write("							alert(res);\r\n");
      out.write("							$(\"#gbt_file_form\").attr({\r\n");
      out.write("								\"action\" : \"gtSpendFileupload.gos\",\r\n");
      out.write("								\"method\" : \"POST\",\r\n");
      out.write("								\"enctype\" : \"multipart/form-data\"\r\n");
      out.write("							}).submit();\r\n");
      out.write("						} else {\r\n");
      out.write("							alert(\"입력 실패\");\r\n");
      out.write("						}\r\n");
      out.write("					},\r\n");
      out.write("					error : function(e) {\r\n");
      out.write("						console.log(e.responseText);\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			$(document).on(\"keyup\", \".number\", function(){\r\n");
      out.write("				var count = $(\".count\");\r\n");
      out.write("				var cost = $(\".cost\");\r\n");
      out.write("				var stcost = $(\".stcost\");\r\n");
      out.write("				var tcost = 0;\r\n");
      out.write("				for(let i=0; i<count.length; i++) {\r\n");
      out.write("					var stcostval = count[i.toString()].value * cost[i.toString()].value\r\n");
      out.write("					tcost += stcostval;\r\n");
      out.write("					stcost[i.toString()].innerText = comma(stcostval) + \"원\";\r\n");
      out.write("					if(stcost[i.toString()].innerText == \"0원\"){\r\n");
      out.write("						stcost[i.toString()].innerText = \"\";\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				$(\"#tcost\").text(\" \");\r\n");
      out.write("				if(tcost > 0){\r\n");
      out.write("					$(\"#tcost\").text(comma(tcost) + \"원\");	\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("	.button-container {\r\n");
      out.write("		text-align: right;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.initial-size {\r\n");
      out.write("		min-height: 200px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	th {\r\n");
      out.write("		background-color: #f2f2f2;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	table {\r\n");
      out.write("		border-collapse: collapse;\r\n");
      out.write("		width: 1000px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	th, td {\r\n");
      out.write("		border: 1px solid black;\r\n");
      out.write("		padding: 8px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#date {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#approval {\r\n");
      out.write("		visibility: hidden;\r\n");
      out.write("		position: absolute;\r\n");
      out.write("		background-color: #fff;\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		margin: auto;\r\n");
      out.write("	}\r\n");
      out.write("	</style>\r\n");
      out.write("	\r\n");
      out.write("	</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("		<div id=\"approval\">\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../approvalline/select.jsp", out, false);
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"button-container\">\r\n");
      out.write("			<input type=\"button\" id=\"line12\" value=\"결재선지정\">\r\n");
      out.write("			<input type=\"button\" id=\"sangsin1\" value=\"상신\">\r\n");
      out.write("			<input  type=\"button\" id=\"close\" value=\"취소\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<form id=\"gbtform\">\r\n");
      out.write("		<input type=\"hidden\" name=\"gsnum\" id=\"gsnum\" value=\"\">\r\n");
      out.write("		<input type=\"hidden\" name=\"writer\" id=\"writer\" value=\"\">\r\n");
      out.write("		<input type=\"hidden\" name=\"approver\" id=\"approver\" value=\"\"> \r\n");
      out.write("		<input type=\"hidden\" name=\"dept\" id=\"dept\"> \r\n");
      out.write("		<input type=\"hidden\" name=\"reference\" id=\"reference\" value=\"\">\r\n");
      out.write("		<input type=\"hidden\" name=\"gpnum\" id=\"gpnum\" value=\"\">\r\n");
      out.write("		<input type=\"hidden\" name=\"genum\" id=\"gpnum\" value=\"\">\r\n");
      out.write("		<h2 align=\"center\">지출결의서</h2>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"120px\">문서번호</th>\r\n");
      out.write("				<td width=\"230px\" id=\"gsnum1\"></td>\r\n");
      out.write("				<th width=\"120px\">보안구분</th>\r\n");
      out.write("				<td width=\"230px\">비공개</td>\r\n");
      out.write("				<th width=\"120px\">보존연한</th>\r\n");
      out.write("				<td width=\"230px\">5년</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"100px\">작성자</th>\r\n");
      out.write("				<td width=\"230px\" id=\"gsname1\"></td>\r\n");
      out.write("				<th width=\"100px\">작성일자</th>\r\n");
      out.write("				<td colspan=\"3\" id=\"date\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table id=\"table1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"50px\">순서</th>\r\n");
      out.write("				<th width=\"80px\">구분</th>\r\n");
      out.write("				<th width=\"170px\">결재자</th>\r\n");
      out.write("				<th width=\"170px\">부서</th>\r\n");
      out.write("				<th width=\"80px\">상태</th>\r\n");
      out.write("				<th width=\"100px\">결재일</th>\r\n");
      out.write("				<th width=\"350px\">결재의견</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">1</td>\r\n");
      out.write("				<td id=\"snag1\"></td>\r\n");
      out.write("				<td id=\"hu1\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept1\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">2</td>\r\n");
      out.write("				<td id=\"snag2\"></td>\r\n");
      out.write("				<td id=\"hu2\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept2\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">3</td>\r\n");
      out.write("				<td id=\"snag3\"></td>\r\n");
      out.write("				<td id=\"hu3\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept3\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">4</td>\r\n");
      out.write("				<td id=\"snag4\"></td>\r\n");
      out.write("				<td id=\"hu4\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept4\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">5</td>\r\n");
      out.write("				<td id=\"snag5\"></td>\r\n");
      out.write("				<td id=\"hu5\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept5\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table id=\"cham1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"133px\">참 조</th>\r\n");
      out.write("				<td id=\"cham\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"133px\">제 목</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"gssubject\" size=\"100%\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">프로젝트</th>\r\n");
      out.write("				<td>\r\n");
      out.write("					<div align=\"center\">\r\n");
      out.write("						<button>project</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">시행일자</th>\r\n");
      out.write("				<td style=\"align: left;\"><input type=\"date\" name=\"gsdate\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"120px\">구분</th>\r\n");
      out.write("				<th width=\"120px\">거래처</th>\r\n");
      out.write("				<th width=\"300px\">적요</th>\r\n");
      out.write("				<th width=\"10px\">수량</th>\r\n");
      out.write("				<th width=\"20px\">단가</th>\r\n");
      out.write("				<th width=\"100px\">금액</th>\r\n");
      out.write("				<th width=\"130px\">결제방법</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<!-- 구분 --> <select name=\"gsgubun\" id=\"gsgubun\">\r\n");
      out.write("						<option value=\"-선택-\">-선택-</option>\r\n");
      out.write("						<option value=\"소모품\">소모품</option>\r\n");
      out.write("						<option value=\"복리후생\">복리후생</option>\r\n");
      out.write("						<option value=\"교통비\">교통비</option>\r\n");
      out.write("						<option value=\"운반비\">운반비</option>\r\n");
      out.write("						<option value=\"보험료\">보험료</option>\r\n");
      out.write("						<option value=\"접대비\">접대비</option>\r\n");
      out.write("						<option value=\"도서비\">도서비</option>\r\n");
      out.write("						<option value=\"수수료\">수수료</option>\r\n");
      out.write("						<option value=\"교육훈련비\">교육훈련비</option>\r\n");
      out.write("						<option value=\"기타\">기타</option>\r\n");
      out.write("						<option value=\"식비\">식비</option>\r\n");
      out.write("						<option value=\"숙박비\">숙박비</option>\r\n");
      out.write("						<option value=\"제경비\">제경비</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"10\"\r\n");
      out.write("					name=\"gsaccount\"></td>\r\n");
      out.write("				<!-- 거래처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"30\" name=\"gsinfo number\"></td>\r\n");
      out.write("				<!-- 적요 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"5\" name=\"gscount\" class=\"count number\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"7\" name=\"gscost\" class=\"cost number\"></td>\r\n");
      out.write("				<!-- 단가 -->\r\n");
      out.write("				<td align=\"center\" class=\"stcost\">\r\n");
      out.write("					\r\n");
      out.write("				</td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\">법인카드</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<!-- 구분 --> <select name=\"gsgubun\" id=\"gsgubun\">\r\n");
      out.write("						<option value=\"-선택-\">-선택-</option>\r\n");
      out.write("						<option value=\"소모품\">소모품</option>\r\n");
      out.write("						<option value=\"복리후생\">복리후생</option>\r\n");
      out.write("						<option value=\"교통비\">교통비</option>\r\n");
      out.write("						<option value=\"운반비\">운반비</option>\r\n");
      out.write("						<option value=\"보험료\">보험료</option>\r\n");
      out.write("						<option value=\"접대비\">접대비</option>\r\n");
      out.write("						<option value=\"도서비\">도서비</option>\r\n");
      out.write("						<option value=\"수수료\">수수료</option>\r\n");
      out.write("						<option value=\"교육훈련비\">교육훈련비</option>\r\n");
      out.write("						<option value=\"기타\">기타</option>\r\n");
      out.write("						<option value=\"식비\">식비</option>\r\n");
      out.write("						<option value=\"숙박비\">숙박비</option>\r\n");
      out.write("						<option value=\"제경비\">제경비</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"10\"\r\n");
      out.write("					name=\"gsaccount\"></td>\r\n");
      out.write("				<!-- 거래처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"30\" name=\"gsinfo number\"></td>\r\n");
      out.write("				<!-- 적요 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"5\" name=\"gscount\" class=\"count number\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"7\" name=\"gscost\" class=\"cost number\"></td>\r\n");
      out.write("				<!-- 단가 -->\r\n");
      out.write("				<td align=\"center\" class=\"stcost\">\r\n");
      out.write("					\r\n");
      out.write("				</td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\">법인카드</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<!-- 구분 --> <select name=\"gsgubun\" id=\"gsgubun\">\r\n");
      out.write("						<option value=\"-선택-\">-선택-</option>\r\n");
      out.write("						<option value=\"소모품\">소모품</option>\r\n");
      out.write("						<option value=\"복리후생\">복리후생</option>\r\n");
      out.write("						<option value=\"교통비\">교통비</option>\r\n");
      out.write("						<option value=\"운반비\">운반비</option>\r\n");
      out.write("						<option value=\"보험료\">보험료</option>\r\n");
      out.write("						<option value=\"접대비\">접대비</option>\r\n");
      out.write("						<option value=\"도서비\">도서비</option>\r\n");
      out.write("						<option value=\"수수료\">수수료</option>\r\n");
      out.write("						<option value=\"교육훈련비\">교육훈련비</option>\r\n");
      out.write("						<option value=\"기타\">기타</option>\r\n");
      out.write("						<option value=\"식비\">식비</option>\r\n");
      out.write("						<option value=\"숙박비\">숙박비</option>\r\n");
      out.write("						<option value=\"제경비\">제경비</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"10\"\r\n");
      out.write("					name=\"gsaccount\"></td>\r\n");
      out.write("				<!-- 거래처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"30\" name=\"gsinfo number\"></td>\r\n");
      out.write("				<!-- 적요 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"5\" name=\"gscount\" class=\"count number\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"7\" name=\"gscost\" class=\"cost number\"></td>\r\n");
      out.write("				<!-- 단가 -->\r\n");
      out.write("				<td align=\"center\" class=\"stcost\">\r\n");
      out.write("					\r\n");
      out.write("				</td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\">법인카드</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<!-- 구분 --> <select name=\"gsgubun\" id=\"gsgubun\">\r\n");
      out.write("						<option value=\"-선택-\">-선택-</option>\r\n");
      out.write("						<option value=\"소모품\">소모품</option>\r\n");
      out.write("						<option value=\"복리후생\">복리후생</option>\r\n");
      out.write("						<option value=\"교통비\">교통비</option>\r\n");
      out.write("						<option value=\"운반비\">운반비</option>\r\n");
      out.write("						<option value=\"보험료\">보험료</option>\r\n");
      out.write("						<option value=\"접대비\">접대비</option>\r\n");
      out.write("						<option value=\"도서비\">도서비</option>\r\n");
      out.write("						<option value=\"수수료\">수수료</option>\r\n");
      out.write("						<option value=\"교육훈련비\">교육훈련비</option>\r\n");
      out.write("						<option value=\"기타\">기타</option>\r\n");
      out.write("						<option value=\"식비\">식비</option>\r\n");
      out.write("						<option value=\"숙박비\">숙박비</option>\r\n");
      out.write("						<option value=\"제경비\">제경비</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"10\"\r\n");
      out.write("					name=\"gsaccount\"></td>\r\n");
      out.write("				<!-- 거래처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"30\" name=\"gsinfo number\"></td>\r\n");
      out.write("				<!-- 적요 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"5\" name=\"gscount\" class=\"count number\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"7\" name=\"gscost\" class=\"cost number\"></td>\r\n");
      out.write("				<!-- 단가 -->\r\n");
      out.write("				<td align=\"center\" class=\"stcost\">\r\n");
      out.write("					\r\n");
      out.write("				</td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\">법인카드</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<!-- 구분 --> <select name=\"gsgubun\" id=\"gsgubun\">\r\n");
      out.write("						<option value=\"-선택-\">-선택-</option>\r\n");
      out.write("						<option value=\"소모품\">소모품</option>\r\n");
      out.write("						<option value=\"복리후생\">복리후생</option>\r\n");
      out.write("						<option value=\"교통비\">교통비</option>\r\n");
      out.write("						<option value=\"운반비\">운반비</option>\r\n");
      out.write("						<option value=\"보험료\">보험료</option>\r\n");
      out.write("						<option value=\"접대비\">접대비</option>\r\n");
      out.write("						<option value=\"도서비\">도서비</option>\r\n");
      out.write("						<option value=\"수수료\">수수료</option>\r\n");
      out.write("						<option value=\"교육훈련비\">교육훈련비</option>\r\n");
      out.write("						<option value=\"기타\">기타</option>\r\n");
      out.write("						<option value=\"식비\">식비</option>\r\n");
      out.write("						<option value=\"숙박비\">숙박비</option>\r\n");
      out.write("						<option value=\"제경비\">제경비</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"10\"\r\n");
      out.write("					name=\"gsaccount\"></td>\r\n");
      out.write("				<!-- 거래처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"30\" name=\"gsinfo number\"></td>\r\n");
      out.write("				<!-- 적요 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"5\" name=\"gscount\" class=\"count number\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"7\" name=\"gscost\" class=\"cost number\"></td>\r\n");
      out.write("				<!-- 단가 -->\r\n");
      out.write("				<td align=\"center\" class=\"stcost\">\r\n");
      out.write("					\r\n");
      out.write("				</td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\">법인카드</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"3\"\r\n");
      out.write("					style='text-align: center; background-color: #f2f2f2; font-weight: bold;'\r\n");
      out.write("					width=\"475px\">합 계</td>\r\n");
      out.write("				<td colspan=\"3\" style='text-align: center;' width=\"475px\" id=\"tcost\"></td>\r\n");
      out.write("				<th width=\"50px\"></th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("	</form>\r\n");
      out.write("	<form id=\"gbt_file_form\">\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"120px\">첨부파일</th>\r\n");
      out.write("				<td><input type=\"file\" name=\"gsfile\" size=\"100%\" multiple=\"multiple\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write(" <br>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
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
