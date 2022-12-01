<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게임등록하기</title>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>

	<div>
		<form method = "post">
			<div>
				<label>게임등록번호</label>
				<input type = "hidden" name = "GAME_ID"/>
			</div>
			<div>
				<label>게임명</label>
				<input type = "text" name = "GAME_NM"/>
			</div>
			<div>
				<label>주체자</label>
				<input type = "text" name = "GAME_OPEN" />
			</div>
			<div>
				<label>게임시작일</label>
				<input type= "date" name = "GAME_START_DT"/>
			</div>
			<div>
				<label>게임종료일</label>
				<input type = "date" name = "GAME_END_DT"/>
			</div>
			<div>
				<input type= "submit" value = "게임등록"> 
			</div>
		</form>
	</div>
</body>
</html>