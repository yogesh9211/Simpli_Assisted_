<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
<a href="homepage.jsp" style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>
<center>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action="UserRegistration" method="post">
	<label for="email">Email :-</label> <input type="email" name="email" id="email" /><br><br>
	<label for="pass">Password :-</label> <input type="password" name="password" id="pass" /><br><br>
	<label for="name">Name :-</label> <input type="text" name="name" id="name" /><br><br>
	<label for="phone no">Phone No. :-</label> <input type="text" name="phoneno" id="phoneno" /><br><br>
	<label for="adharno">Aadhaar No. :-</label> <input type="text" name="adharno" id="adarno" /><br><br>
	<input type="submit" value="submit" /> <input type="reset" />
</form>
</div>
</center>
</body>
</html>