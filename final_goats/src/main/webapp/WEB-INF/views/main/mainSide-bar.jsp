<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>GOAT.S</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
                
      $(document).ready(function(){
         
        $("#app").hover(function(){
          $("#appdiv").css({"visibility":"visible"});
        }, function(){
          $("#appdiv").css({"visibility":"hidden"});
        });
        
        $(".myLink").on("click", function() {
            window.location.href = "mainpage_draft2.gos";
          });
       
	    $.ajax({
	    	url:"logincheck.gos",
	    	async:false,
	    	success:gename,
	    });
	    function gename(d){
	    	if(d != "loginx"){
	    		$("#gename").text(d);
	    	}else{
	    		location.href="loginx.gos"
	    	}
	    	
	    }
        

	    
      });
	    function mypage(){
	    	location.href="gtMypage.gos";
	    }
    </script>
    <style type="text/css">
     a:visited {
       text-decoration: none;
   }
    
    
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
        max-height: 970px;
      }
      
      #appdiv {
        visibility: hidden;
        overflow: hidden;
      }
      
      #appdiv > li {
        left: 50%;
        transform: translateX(-50%);
      }
      
      body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f7f7f7;
      }
      
      body {
        display: flex;
        flex-direction: column;
      }
      
      #body {
        flex: 1;
      }
      
      #body {
        height: 100%;
      }
      
      .container {
        margin: 0;
        padding: 0px;
        background-color: #fff;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        width: 300px;
      }
      
      h2 {
        margin: 0;
        padding: 10px 10px;
        text-align: center;
        color: #337ab7;
      }
      
      h5 {
        margin: 0;
        padding: 5px 0;
        text-align: center;
        color: #555;
      }
      
      hr {
        margin: 20px 0;
        border: 0;
        border-top: 1px solid #ddd;
      }
      
      ul {
        list-style-type: none;
        padding: 0;
        height: 100%;
      }
      
      li {
        padding: 10px 0;
        text-align: center;
        color: #333;
        cursor: pointer;
      }
      
      
      .li:hover {
        background-color: #f5f5f5;
      }
      
      #div1 {
        background-color: #fff;
        height: 60px;
        cursor: pointer;
        width: 300px;
      }
      
      #lidiv {
        width: 250px;
        height: 100%;
        max-height: 910px;
      }
      
      .con {
        height: 100%;
      }
      
        .hover-element {
    text-align: center;
  }
  a{
  	text-decoration: none; 
  	color:#424242;"
  }
  a:visited {
       text-decoration: none;
   }
    </style>
  </head>
  <body id="body">
    <div id="body"> 
      <div id="div1">
        <h2 onclick="location.href='mainpage.gos';">GOAT.S</h2>
      </div>
      <div class="container con">
        <hr />
        <div id="lidiv">
			<div style="text-align:center;">
				<a href="javascript:mypage()" id="logincheck"><img src="resources/goats_icon/login_page_id.png" style="width:30px; height:30px;"><span id="gename"></span>님 반갑습니다.</a>
			</div>
          <hr>
          <ul>
            <li class="li" onclick="location.href='mainpage.gos';">Home</li>
            <li class="li" onclick="location.href='#';">출장/교육</li>
            <li class="li" onclick="location.href='#';">휴가</li>
            <li class="li" onclick="location.href='#';">프로젝트</li>
            <li class="li" onclick="location.href='#';">공지사항</li>
            <li class="li" id="app" onclick="location.href='mainpage_draft.gos';">전자결재
              <div id="appdiv">
                <ul style="position:absolute; margin-top:10px; margin-left:100px;">
                   <li><a href="document.gos" style="text-decoration: none; color:#424242;">문서함</a></li>
                <li>결재함</li>
                <li>진행함</li>
                <li>참조함</li>
                <li>기안함</li>
                <li>반려함</li>
                </ul>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </body>
</html>