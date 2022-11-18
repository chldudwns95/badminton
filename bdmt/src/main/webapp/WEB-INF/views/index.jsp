<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mainPage</title>
<link href = "/css/index.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
	<header>
		<a href = "/"> <img alt = "로고" src = "/image/logo.png"></a>
		<nav>
			<ul>
				<!-- 메뉴  -->
				<li><a href = "/intro/introList">공지사항</a></li>
				<li><a href = "/game/gameList">경기</a></li>
				<li><a href = "/team/teamList">팀</a></li>
				<li><a href = "/team/teamList">선수</a></li>
				
				<c:if test="${sessionScope.user == null }">
					<li><a href = "/user/signUp">회원가입</a></li>
					<li><a href = "/login">로그인</a></li>
				</c:if>
				
				<c:if test = "${sessionScope.user != null }">
					<li>${sessionScope.user.USER_NM} 님</li>
					<li>${sessionScope.user.USER_ID}</li>
					<li><a href = "/logout">로그아웃</a></li>
					<li><a href = "/">회원정보수정</a></li>
				</c:if>
				<!-- <li><a href = "/user/myEdit">회원정보수정</a></li> -->
			</ul>
		</nav>
	</header>
	<a class ="mainImg">
		<img src = "./image/mainImg1.png">
	</a>
	<div class = "wrap">
		<div class = "wrap-content">게시글바로가기</div>
		<div class = "wrap-content">게시글바로가기</div>
		<div class = "wrap-content">선수바로가기</div>
		<div class = "wrap-content">게시글바로가기</div>
	</div>
	
	
</body>
</html>