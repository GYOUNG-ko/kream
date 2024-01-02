<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	table {
		border: 1px solid #000; /* 테두리 폭, 스타일, 색상 순서대로 설정 */
		margin: 20px; /* 상하좌우 20px의 외부 여백 설정 */
		border-collapse: collapse; /* 테두리 충돌 모델 설정 */
		border-collapse: separate; /* 테두리 분리 모델 설정 */
    	border-spacing: 5px; /* 셀 간격 설정 */
    	border-radius: 10px; /* 테두리 둥글게 만들기 */
    	box-shadow: 3px 3px 5px #888888; /* 그림자 설정 */
	}
</style>
<meta charset="UTF-8">
<title>상품추가</title>
</head>
<body>
	<button type="button" onclick="window.open(
		'InsertCategory1', 'InsertCategory1', 'width=300, height=200, top=200, left=300');"
			style="position: relative;">카테고리1 등록</button><br>
	<button type="button" onclick="window.open(
		'InsertCategory2', 'InsertCategory2', 'width=300, height=300, top=200, left=300');"
			style="position: relative;">카테고리2 등록</button><br>
	<a href="InsertCategory1">카테고리1</a>
	<a href="InsertCategory2">카테고리2</a>
	
	<div align="center">
		<table>
			<form action="#" method="post" enctype="multipart/form-data">
				<tr>
					<th colspan="2">
						<p>상품추가</p>
					</th>
				</tr>
				<tr>
					<td>모델번호 :</td>
					<td><input type="text" name="productId"></td>
				</tr>
				<tr>
					<td>카테고리1</td>
					<td>
						<select>
								<option>==선택==</option>
								<option>남성</option>
								<option>여성</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>카테고리2</td>
					<td>
						<select>
								<option>==선택==</option>
								<option>의류</option>
								<option>신발</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>브랜드</td>
					<td>
						<select>
								<option>==선택==</option>
								<option>나이키</option>
								<option>뉴발란스</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>상품이름(한글) :</td>
					<td><input type="text" name="nameKr"></td>
				</tr>
				<tr>
					<td>상품이름(영문) :</td>
					<td><input type="text" name="nameEn"></td>
				</tr>
				<tr>
					<td>상품설명 :</td>
					<td><textarea rows="5" cols="22" type="text" name="content"></textarea></td>
				</tr>
				<tr>
					<td>출시가격 :</td>
					<td><input type="text" name="priceFirst"></td>
				</tr>
				<tr>
					<td>출시일 :</td>
					<td><input type="Date" name="priceFirst"></td>
				</tr>
				<tr>
					<td>색상 :</td>
					<td><input type="text" name="priceFirst"></td>
				</tr>
				<tr>
					<td>사이즈 :</td>
					<td><input type="text" name="priceFirst"></td>
				</tr>
				<tr>
					<td align="center" colspan="2">
					<input type="submit" value="추가">
					<input type="button" value="목록">
					</td>
				</tr>
			</form>
		</table>
	</div>
</body>
</html>