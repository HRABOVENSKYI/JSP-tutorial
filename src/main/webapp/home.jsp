<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int coef = 3;
%>
<h1>Hello, World!</h1>
<%
    response.getWriter().println(5 + 1);
%>
My fav num is : <%=coef%>
</body>
</html>
