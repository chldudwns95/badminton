<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원가입</title>
<link href = "/css/login.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	 <div class= "logo"><a href = "/"><img src="/logo.png" alt=""></a>
	    </div>
	    <div class = "signUp-wrap">
	  		<form class = "wrap-form" method = "post">
	            <div class = "sub">
	                <label>권한 </label>
	                <input type = "text" name = "ROLE">
	            </div>
	            <div class = "sub">
	                <label>아이디 </label>
	                <input type = "text" name = "USER_ID">
	            </div>
	            <div class = "sub">
	                <label>이름 </label>
	                <input type = "text" name = "USER_NM">
	            </div>
	            <div class = "sub">
	                <label>비밀번호 </label>
	                <input type = "password" name = "PASSWORD"> 
	            </div>
	            <div class = "sub">
	                <label>연락처 </label>
	                <input type = "number" name = "PHONE">
	            </div>
	            <div class = "sub">
	                <label>부서 </label>
	                <input type = "text" name = "DEPT_CD">
	            </div>
	            <!-- 성별, 생년월일, 프로필사진 -->
	            <div class = "sBtn">
	                <input type = "submit" value ="회원가입">
	            </div>
			</form>
		</div>
	</body>
</html>

