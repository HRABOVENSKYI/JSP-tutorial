package com.example.demoapp;

import java.sql.*;

public class LoginDao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String QUERY = "select * from users where username=? and password=?";

    public boolean checkCredentials(String username, String password) {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(QUERY);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
