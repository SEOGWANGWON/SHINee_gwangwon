<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- 팔로우는 숫자로 시간남으면 text image 넣어보기--> 
<html lang="ko">
    <head>
    	<meta charset="UTF-8">
        <title>www.music.shinee.com</title> <!-- 폰트 샤이한걸로  세기말 감성으로 -->
        <style>
            .searchIcon{
                margin: 0 0 0 0;
                width: 22px;
                height: 22px;
                padding: 0 0 0 0;
                background-color: rgb(167, 255, 255);
                margin-bottom: -2%;

            }
            .searchMusic{
                padding: 0px;
                height: 20px;

            }
            .searchMusicBox{
                margin: -10px 0 -10px -8px;
                padding: 0;
                height: 1000px;
                width: 300px;
                min-height: 100%;
                max-height: 100%;
                min-width: 300px;
                max-width: 300px;
                border: 1px solid rgb(179, 177, 177);
                text-align: center;
                background-color:rgb(105, 238, 255);;

            }
            body{
                background-color: rgb(167, 255, 255);
            }
            #myAudio{
                width: 90%;
                height: 15%;
                
            }
            .top-tag{
                display: inline-block;
                background-color: rgb(7, 211, 211);
                width: 84.45%;
                min-width: 0 auto;
                border: 1px solid rgb(3, 156, 156);
                
            }
            
        </style>
    </head>
    <body>
        <div>
            <div class="searchMusicBox">
                    <label>
                        <h2><strong style="width: 30px; height: 30px;">shinee</strong><img src="./img/뮤직아이콘.png" style="width: 30px; height: 30px;"></h2>
                        <input type="text" id="searchMusic" class="searchMusic" placeholder="가수 이름,노래 검색"><img src="./img/images.jpg" class="searchIcon">
                        <br> <!--둘러보기, 나의 플레이리스트 클릭할 태그 -->
                        <div style="padding: 0; margin-right: 20%;margin-top: 5%;">
                            <a href="둘러보고싶은 음악모음 링크"><li style="margin-top: 10%;">음악 둘러보러가기</li></a>
                            <a href="나의 플레이 리스트 링크 "><li style="margin-top: 10%;">나의 플레이리스트</li></a>
                            <a href="팔로우 목록링크"><li style="margin-right: 20%; margin-top: 10%;">팔로우 목록</li></a>
                        </div>
                        <audio id="myAudio" controls autoplay>
                            <source src="음악파일경로" type="audio/mpeg">
                        </audio>
                    </label>
            </div>
            <div style="text-align: right; margin-right: -8px; margin-top: -1000px;">
                <label class="top-tag">
                    <input type="text" style="width: 500px; height: 24px; margin: 2px; margin-right: 40%;" placeholder="플레이 리스트, 닉네임, 가수 이름, 노래 검색">
                    <a href="file:///C:/Users/user1/Frontend-workspace/asubProject/%EC%83%A4%EC%9D%B4%EB%8B%88%EA%B0%9C%EC%9D%B8%EC%A0%95%EB%B3%B4%ED%8E%98%EC%9D%B4%EC%A7%80.html"><img src="./img/user.png" style="width: 25px; height: 25px; margin: -8px 5px;"></a>
                    
                </label>
            </div>
        </div>
        <script>
            const audio = document.getElementById("myAudio");
            audio.play();
        </script>
    </body>
</html>