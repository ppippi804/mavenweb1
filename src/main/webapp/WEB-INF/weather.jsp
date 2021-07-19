<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){ 
  $("button").click(function(){
    $.ajax({url: "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=NdZVcNclGWUa9BJwyDAANfWizb4QCHMBWGeN2E4iZIGAvck%2BNaeUkJSS2xbdqATZM3y%2BUfzxsiVWXDdEk96Lsw%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1", success: function(result){
      $("#div1").html(result);
    }});
  });
});
</script>
</head>
<body>
<div id="div1" style = "witdh:100%;border:1pz solid gray;"></div>
<button>Get External Content</button>
<p>
<iframe width = "100%" src = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=NdZVcNclGWUa9BJwyDAANfWizb4QCHMBWGeN2E4iZIGAvck%2BNaeUkJSS2xbdqATZM3y%2BUfzxsiVWXDdEk96Lsw%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1"></iframe>
</body>
</html>
