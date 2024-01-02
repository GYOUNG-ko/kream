<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Asta</title>
 <style> 
 	body {  padding-top: 3000px; }
 	

 </style>
 <link rel="icon" href="/img/A.png">
 </head>
 <body>
	<c:import url="/header"/>
	<hr>
	<c:import url="/main"/>
	<div align="center" >
		${msg }
	</div>
	<c:import url="/footer"/>
</body>
</html>



