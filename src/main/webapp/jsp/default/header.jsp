<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Asta</title>
<style type="text/css">
@import url("css/head.css")
</style>

</head>

<body>
<div class="start">
	<!-- 시작 효과를 주기 위한 컨테이너 -->
	<div class="start-effect-container">
		<!-- 로고 이미지 -->
		<img class="logo" src="/img/asta-removebg-preview.png" alt="로고" width="20%" height="20%">
	</div>

	<!-- 메인 페이지 컨텐츠 -->
	<div class="main-content">
		<div id="header_wrap">
			<div id="header" class="container cf">
				<h1>
					<a href="../index"> <img src="/img/asta-removebg-preview.png" width="150" height="150" align="left">
					</a>
				</h1>
				<div id="gnb_wrap">
					<div id="gnb">
						<ul class="cf">
							<li class="login"><a href="../index">로그인</a></li>
							<li class="join"><a href="../index">회원가입</a></li>
							<li class="mypage"><a href="../index">마이페이지</a>
						</ul>
					</div>
					<div id="lnb">
						<ul class="cf">
							<li><a href="../index">고객센터</a></li>
							<li><a href="../index">경매일정</a></li>
							<li><a href="../index">상품</a></li>

						</ul>
					</div>
				</div>
			</div>
		</div>
		
		<!-- 추가적인 메인 페이지 컨텐츠를 여기에 추가하세요 -->
	</div>
</div>
	<!-- JavaScript 코드 -->
	<script>
		document
				.addEventListener(
						'DOMContentLoaded',
						function() {
							// 페이지가 로드될 때 실행되는 코드
							// 로고가 사라진 후에 메인 페이지를 표시합니다.
							setTimeout(
									function() {
										document
												.querySelector('.start-effect-container').style.display = 'none';
										document.querySelector('.main-content').style.display = 'block';
									}, 2000); // 2초 후에 실행
						});
	</script>
</body>

</html>


