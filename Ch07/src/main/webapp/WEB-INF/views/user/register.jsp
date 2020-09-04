<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user-register</title>
</head>
<body>
	<h3>직원 등록하기</h3>
	
	<form action="/ch07/user/register" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp"></td>
			</tr>
			<tr>
				<td>직급</td>
				<td>
					<select name="pos">
						<optioin>사원</optioin>
						<optioin>대리</optioin>
						<optioin>과장</optioin>
						<optioin>차장</optioin>
						<optioin>부장</optioin>
					</select>
				</td>
			</tr>
			<tr>
				<td>부서</td>
				<td>
					<select name="dep">
						<optioin value="101">영업1부</optioin>
						<optioin value="102">영업2부</optioin>
						<optioin value="103">영업3부</optioin>
						<optioin value="104">인사부</optioin>
						<optioin value="105">영업지원부</optioin>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" >
					<input type="submit" value="등록하기">
				</td>
			</tr>
		</table>
	
	</form>

	
</body>
</html>