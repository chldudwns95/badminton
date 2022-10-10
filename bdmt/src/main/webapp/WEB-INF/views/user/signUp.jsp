<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
	<form method = "post">
		<div>
			<label>사용자번호 : </label>
			<input type = "text" name = "USER_ID">
		</div>
		<div>
			<label>사용자이름 : </label>
			<input type = "text" name = "USER_NM">
		</div>
		<div>
			<label>비밀번호 : </label>
			<input type = "password" name = "PASSWORD"> 
		</div>
		<div>
			<label>연락처 : </label>
			<input type = "number" name = "PHONE">
		</div>
		<div>
			<label>권한 : </label>
			<input type = "text" name = "ROLE">
		</div>
		<div>
			<label>부서 : </label>
			<input type = "text" name = "DEPT_CD">
		</div>
		<div>
			<input type = "submit" value ="회원가입">
		</div>
	</form>
</body>
</html>

