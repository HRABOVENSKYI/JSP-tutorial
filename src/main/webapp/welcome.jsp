<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setHeader("Expires", "0"); // Proxies

    if (session.getAttribute("username") == null) {
        response.sendRedirect("login.jsp");
    }
%>
Welcome, ${username}! <br>
I wanna show you this <a href="videos.jsp">amazing videos</a>
<form action="Logout">
    <input type="submit" value="Logout">
</form>
</body>
</html>
