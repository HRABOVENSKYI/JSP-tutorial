<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
101 <br>
Navin <br>
88 <br>

<%
    // Set MySQL connection
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/test_db";
    String username = "root";
    String password = "root";
    Class.forName(driver);
    Connection con = DriverManager.getConnection(url, username, password);

    String sql = "select * from student where id=103";
    Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
    resultSet.next();
%>
Student id : <%= resultSet.getString(1) %> <br>
Student name : <%= resultSet.getString(2) %> <br>
Student marks : <%= resultSet.getString(3) %>
</body>
</html>
