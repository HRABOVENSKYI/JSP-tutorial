package com.example.demoapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("userName");
        String password = req.getParameter("password");

        LoginDao dao = new LoginDao();

        if (dao.checkCredentials(username, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect("welcome.jsp");
        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}
