<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${student.name} <br> <%-- Single --%>
<c:out value="Hello, ${student.name}!" /> <br> <%-- Hello, Single! --%>
<c:forEach items="${students}" var="s">
    ${s} <br>
</c:forEach> <%-- Prints every student's toString --%>
</body>
</html>
