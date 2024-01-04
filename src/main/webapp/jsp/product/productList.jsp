<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
	<h3>상품목록</h3>
	<c:choose>
		<c:when test="${empty product}">
			<h3>등록된 데이터가 없습니다</h3>
		</c:when>
		<c:otherwise>
			<table border="1">
				<tr>
					<th>상품번호</th>
					<th>모델번호</th>
					<th>카테고리1</th>
					<th>카테고리2</th>
					<th>브랜드</th>
					<th>상품이름(한글)</th>
					<th>상품이름(영어)</th>
					<th>상품설명</th>
					<th>출시가격</th>
					<th>출시일</th>
					<th>상품 등록일</th>
					<th>색상</th>
					<th>사이즈</th>
					<th>등록</th>
				</tr>
				<c:forEach var="product" items="${product}">
					<tr>
						<td>${product.productNo }</td>
						<td>${product.productId }</td>
						<td>${product.cate1Name }</td>
						<td>${product.cate2Name }</td>
						<td>${product.brand }</td>
						<td>${product.nameKr }</td>
						<td>${product.nameEn }</td>
						<td>${product.content }</td>
						<td><fmt:formatNumber value="${product.firstPrice}" pattern="#,###" /></td>
						<td><fmt:formatDate value="${product.releaseDay}" pattern="yyyy-MM-dd" /></td>
						<td><fmt:formatDate value="${product.registDay}" pattern="yyyy-MM-dd" /></td>
						<td>${product.color }</td>
						<td>${product.size }</td>
						<td><a href="addAuction?no=${product.productNo }">경매등록</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
</body>
</html>