<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="style/common.css" />
<style type="text/css">
* {
    background: none repeat scroll 0 0 transparent;
    border: 1 none;
    margin: 0;
    padding: 0;
    vertical-align: baseline;
	font-family:微软雅黑;
	overflow:hidden;
}
a:hover{text-decoration:none;}
.red{color:red;font-size: 15px;}
#navi{
	width:100%;
	position:relative;
	word-wrap:break-word;
	border-bottom:1px solid #065FB9;
	margin:0;
	padding:0;
	height:40px;
	line-height:40px;
	vertical-align:middle;
    background-image: -moz-linear-gradient(top,#EBEBEB, #BFBFBF);
    background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #EBEBEB),color-stop(1, 
#BFBFBF));
}
#naviDiv{
	font-size:14px;
	color:#333;
	padding-left:10px;
}
#tips{
	margin-top:10px;
	width:100%;
	height:40px;
}
#buttonGroup{
	padding-left:10px;
	float:left;
	height:35px;
}
.button{
	margin-top:20px;
	padding-left:10px;
	padding-right:10px;
	font-size:14px;
	width:70px;
	height:30px;
	line-height:30px;
	vertical-align:middle;
	text-align:center;
	cursor:pointer;
    border-color: #77D1F6;
    border-width: 1px;
    border-style: solid;
    border-radius: 6px 6px;
    -moz-box-shadow: 2px 2px 4px #282828;
    -webkit-box-shadow: 2px 2px 4px #282828;
    background-image: -moz-linear-gradient(top,#EBEBEB, #BFBFBF);
    background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #EBEBEB),color-stop(1, #BFBFBF));
}
#mainContainer{
	padding-left:10px;
	padding-right:10px;
	text-align:left;
	width:98%;
	font-size:18px;
}

</style>
<body>
<script type="text/javascript" src="js/Calendar3.js"></script>
<script type="text/javascript">
function checkName(){
	var studentName=document.getElementById("studentName").value;
	if(studentName==""){
		document.getElementById("name_tip").innerHTML="姓名不能位空";
		return false;
	}else{
		document.getElementById("name_tip").innerHTML="";
		return true;
	}
	
}  

function checkId(){
	var studentId=document.getElementById("studentId").value;
	if(studentId==""){
		document.getElementById("id_tip").innerHTML="学号不能位空";
		return false;
	}else if(studentId.length>10){
		document.getElementById("id_tip").innerHTML="学号不能超过10位";
		return false;
	}else{
		document.getElementById("id_tip").innerHTML="";
		return true;
	}
	
}  
function checkphoneId(){
	var phoneId=document.getElementById("phoneId").value;
	var reg=/^1\d{10}$/;
	if(reg.test(phoneId)){
		document.getElementById("phoneId_tip").innerHTML="";
	    return true;
		
	}else{
		document.getElementById("phoneId_tip").innerHTML="手机号码格式不正确";
		return false;
	}
	
} 
function checkPassword(){
	var password=document.getElementById("password").value;
	if(password==""){
		document.getElementById("password_tip").innerHTML="密码不能为空";
	    return false;
	}else if(password.length>15){
		document.getElementById("password_tip").innerHTML="密码长度不能超过15位";
	    return false;
		
	}else{
		document.getElementById("password_tip").innerHTML="";
		return true;
	}
	
}  

function checkSuccess(){
	if(checkName()&&checkId()&&checkphoneId()&&checkPassword()){
		return true;
	}else{
		return false;
	}
	
}
</script>
<div id="navi">
	<div id='naviDiv'>
		<span><img src="images/arror.gif" width="7" height="11" border="0" alt=""></span>&nbsp;学生管理<span>&nbsp;
		<span><img src="images/arror.gif" width="7" height="11" border="0" alt=""></span>&nbsp;<a href="StudentQuery">学生管理列表</a><span>&nbsp;
	    <span><img src="images/arror.gif" width="7" height="11" border="0" alt=""></span>&nbsp;学生信息添加<span>&nbsp;
	</div>
</div>
<div id="tips">
</div>
<div id="mainContainer">
<strong>添加学生信息</strong>
<br>
<br>
<form name="form" action="StudentAdd" onSubmit="return checkSuccess()" method="post">
<table width="400" >
  <tr>
    <td width="25%">学号</td>
    <td><input type="text" name="studentId" id="studentId" onblur="checkId()" /></td>
    <td><span id="id_tip" class="red"></span></td>
  </tr>
 
   <tr>
    <td>姓名</td>
    <td><input type="text" name="studentName" id="studentName" onblur="checkName()"/></td>
     <td><span id="name_tip" class="red"></span></td>
  </tr>
   <tr>
    <td>性别：</td>
     <td><select name="gender" style="width:80px;">
        <option>男</option>
        <option>女</option>
     </select>
     </td>
  </tr>
  <tr>
    <td>出生日期：</td>
    <td><input name="birthday" type="text" id="birthday" size="20"
      maxlength="10" onclick="new Calendar().show(this);" readonly="readonly" />
    </td>
     <td><span id="birthday_tip" class="red"></span></td>
  </tr>
  <tr>
    <td>手机号：</td>
    <td><input type="text" name="phoneId" id="phoneId" onblur="checkphoneId()"/></td>
    <td><span id="phoneId_tip" class="red"></span></td>
  </tr>
  <tr>
    <td>密码：</td>
    <td><input type="text" name="password" id="password" onblur="checkPassword()"/></td>
    <td><span id="password_tip" class="red"></span></td>
  </tr>
  
  <tr >
    <td colspan="3" align="center"><input class="button" type="submit" value="添加"></td>
  </tr>
</table>
</form>
<script type="text/javascript">
var info="${info}";
if(info!=""){
	alert(info);
}
</script>
</div>
</body>
</html>