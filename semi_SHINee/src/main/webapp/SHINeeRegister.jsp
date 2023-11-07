<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>SHINee Music회원가입 페이지</title>
	</head>
	<body>
		<div class="pageColor">
            <button style="float: right; margin: 0 0 -5% 0; width: 22px;height: 22px;">X</button>
            <img src="./img/oldicon/Tab.png" class="pawnTab">
            <div id="createAccount">
                <div id="divid">
                    <label for="id">
                        <img src="./img/oldicon/user.png" style="width: 28px;height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="id" type="text" placeholder="아이디">
                    <button id="idButton">아이디 중복 확인</button>
                </div>
                <br>
                <form onsubmit="return submitPassword()">
                    <div>
                    
                        <label for="pw">
                            <img src="./img/oldicon/password.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                        </label>
                        <input id="pw" type="password" placeholder="비밀번호">
                        <p id="pm" style="color: red;"></p>
                    </div>
                    <br>
                    <div>
                        <label for="checkpw">
                            <img src="./img/oldicon/passwordcheck.png" style="width: 26px; height: 26px; margin-bottom: -8px;">
                        </label>
                        <input id="checkpw" type="password" placeholder="비밀번호 확인">
                        <input type="submit" value="비밀번호 확인">
                        <p id="checkpm" style="color: red;"></p>
                   	</div>
               	 </form>
               </div>
                <br>
                <div>
                    <label for="nickname">
                        <img src="./img/oldicon/profile.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="nickname" type="text" placeholder="닉네임">
                    <button id="checkNname">닉네임 중복 확인</button>
                </div>
                <br>
                <div>
                    <strong class="desktext">프로필 사진</strong>
                </div>
                <br>
                <div>
                    <label for="emailid">
                        <img src="./img/oldicon/email.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="emailid" type="text" placeholder="이메일 주소">
                    <strong>@ </strong>
                    <input id="emailLink" type="text" placeholder="naver.com">
                </div>
                <br>
                <div>
                    <label for="phoneNumber2">
                        <img src="./img/oldicon/phone.png" style="width: 28px; height: 26px; margin-bottom: -8px;">
                    </label>
                    <input id="phoneNumber1" type="text" placeholder="010">
                    <strong>-</strong>
                    <input id="phoneNumber2" type="text" placeholder="0000">
                    <strong>-</strong>
                    <input id="phoneNumber3" type="text" placeholder="0000">
                </div>
            </div>

            
        </div>
        <script src="https://code.jquery.com/jquery-3.7.1.js" 
        integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
        crossorigin="anonymous"></script>
        <script>
            function submitPassword(){
                var password = document.getElementById("pw").value;
                var passwordCheck = document.getElementById("checkpw").value;

                var passwordPattarn = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,20}$/;
                var errorPW = document.getElementById("pm");
                var checkErrorPW = document.getElementById("checkpm");

                if(!passowrd.match(passwordPattarn)){
                    errorPW.textContent = "비밀번호는 8 ~ 20자의 영문 대문자, 소문자, 특수문자, 숫자를 포함해야합니다.";
                    return false;
                } else{
                    errorPW.textContent = "";
                }

                if(password !== passwordCheck){
                    checkErrorPW.textContent = "비밀번호가 일치하지 않습니다.";
                    return false;
                } else{
                    checkErrorPW.textContent = "";
                }
                return true;

            }
	</body>
</html>