<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>FlyAway</h1>

<div align="right">
<a href="adminpage.jsp">Admin Login</a>
</div>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user!=null){
%>
<p>Welcome <%=user.get("name") %></p>
<a href="Logout">Logout</a>
<%
	}else{
%>
<a href="userpage.jsp">User Login</a>
<%
	}
%>
<br><br>
<center>
<div style="border:5px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action="FlightList" method="post">
	<label for="from">From :-</label> <input type="text" name="from" id=from/><br><br>
	<label for="to">To :-</label> <input type="text" name="to" id="to"/><br><br>
	<label for="departure">Departure :-</label> <input type="date" name="departure" id="departure"/><br><br>
	<label for="travellers">Travellers :-</label> <input type="number" name="travellers" id="travellers"/><br><br>
	<input type="submit" value="Search" /> <input type="reset" />
</form>
</div>
</center>
</body>
</html>