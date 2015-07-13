<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
	是否存在：<c:out value="${count}"></c:out>
	<form id="loginForm" action="/project/login.do" method="get">
		<input type="text" name="userName"/>
		<input type="text" name="passWord"/>
		<input type="button" value="登录" onclick="login();"/>
	</form>
</body>
	<script type="text/javascript">
		function login() {
			document.getElementById("loginForm").submit();
		}
	</script>
</html>