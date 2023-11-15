<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 완성되지 않았습니다. -->
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>아이디 중복 체크</title>
	</head>
	<body onload="pValue()">
		<div id="wrap">
			<br>
			<b><font size="4" color="gray">아이디 중복체크</font></b>
			<hr size="1" width="460">
			<br>
			<div id="chk">
				<form id="checkForm">
					<input type="text" name="idinput" id="userId">
					<input type="button" value="중복확인" onclick="idCheck()">
					
				</form>
				<div id="msg"></div>
				<br>
				<input id="cancelBtn" type="button" value="취소" onclick="wondiw.close()">
				<input id="useBtn" type="button" value="사용하기" onclick="sendCheckValue()">
			</div>
		</div>
		
		<script src="https://code.jquery.com/jquery-3.7.1.js" 
        integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
        crossorigin="anonymous">	
		</script>
		<script src="js/IdCheck.js"></script>	
	</body>
</html>