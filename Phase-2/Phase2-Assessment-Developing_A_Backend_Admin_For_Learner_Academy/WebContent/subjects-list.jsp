<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body style="background-image: url('css/background.jpg');">
	<div id="page">
		<jsp:include page="left-list.jsp" />


		<div id="wrapper">

			<div id="header">
				<h3>Subjects</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>Name</th>
						<th>Shortcut</th>
						

					</tr>

					<c:forEach var="tempSubject" items="${SUBJECTS_LIST }">
						<tr>

							<td>${tempSubject.name}</td>
							<td>${tempSubject.shortcut}</td>
							

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>

</body>
</html>