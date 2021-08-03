<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/test_db" user="root"
                   password="root"/>
<sql:query var="rs" dataSource="${db}"> select * from student </sql:query>
<c:forEach items="${rs.rows}" var="student">
    <c:out value="${student.id}"/> : <c:out value="${student.name}"/> : <c:out value="${student.marks}"/>
    <br> <%-- prints every record from the DB --%>
</c:forEach>
</body>
</html>
