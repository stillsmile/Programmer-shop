 <%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>学生管理首页</title>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="style/index.css" />
	 <script language="javascript">
	 var manageId="${sessionScope.manageId}"
		    if(manageId.length==0||manageId==null){
		       alert("您尚未登录！");
		       top.location = "Login.jsp";
		    }
	    
   </script> 
    <script type="text/javascript" src="js/onclock.js">
   </script>  
</head>
<body onload="disptime()">
<div id="wrapper" style="width:100%">
	<div id="header">
		<div id="title">学生信息管理系统</div>
		<div id="user_info">
			<div id="welcome">欢迎您,${sessionScope.manageName}</div>
		</div>
	</div>
	<div id="navigator">
		<iframe src="tree.jsp"></iframe>
    </div>
    <div>
	  <div id="main">
		<iframe name="MainFrame" src="main.jsp"></iframe>
	  </div>
	</div>
	<div id="footer"> </div>
</div>

</body>
<script type="text/javascript">
function screenAdapter(){
	document.getElementById('footer').style.top=document.documentElement.scrollTop+document.documentElement.clientHeight- document.getElementById('footer').offsetHeight+"px";
		document.getElementById('navigator').style.height=document.documentElement.clientHeight-100+"px";
		document.getElementById('main').style.height=document.documentElement.clientHeight-100+"px";
		document.getElementById('main').style.width=window.screen.width-400+"px";
}

window.onscroll=function(){screenAdapter();};
window.onresize=function(){screenAdapter();};
window.onload=function(){screenAdapter();};
</script>
</html>