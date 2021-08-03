<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="str" value="Teodor writed this code"/>
Length : ${fn:length(str)} <br> <%-- Length : 23 --%>
<c:forEach items="${fn:split(str, ' ')}" var="s">
    ${s} <br> <%-- Will print every word separately on a new line --%>
</c:forEach>
index : ${fn:indexOf(str, "d")} <br> <%-- Finds first index of d letter in the string --%>
is there : ${fn:contains(str, "fff")} <br> <%-- Will print false because str does not contain "fff" --%>
</body>
</html>
