<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Heyy, now call Error page</h1> <%-- Not printed --%>
<%
    response.getWriter().println("Heyy, now call Error page"); // Not printed
    int k = 9 / 0;
%>
</body>
</html>
