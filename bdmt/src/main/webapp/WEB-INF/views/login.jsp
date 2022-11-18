<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영합니다!</title>
</head>
<style>
    
    .logo{text-align: center;}
    .F-wrap{display: flex; justify-content: center;}
    .wrap{width : 50%; display:flex; flex-direction: column; justify-content: center; align-items: center; border: 2px solid #ddd; }
    
</style>
<body>
    <div class= "logo">
        <a href = "#"><img src="/logo.png" alt=""></a>
    </div>
    <div class = "F-wrap">
        <div class = "wrap">
            <form action = "login" method = "post" class = "wrap-form">
                <div class ="sub">
                    <label>
                        <input type="text" placeholder="아이디" placeholder = "아이디를 입력하여주십시오">
                    </label>
                </div>
                <div class ="sub">
                    <label>
                        <input type ="password" placeholder="비밀번호" placeholder = "비밀번호를 입력하여주십시오.">
                    </label>
                </div>
                <div class ="lBtn">
                    <label>
                        <input type="submit" value="로그인">
                    </label>
                </div>
            </form>
        </div>
    </div>
</body>
</html>