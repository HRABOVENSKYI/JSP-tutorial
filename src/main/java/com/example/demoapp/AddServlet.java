package com.example.demoapp;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

        Cookie cookie = new Cookie("k", k + "");
        resp.addCookie(cookie);

        resp.sendRedirect("sqr?k=" + k);

//        RequestDispatcher rd = req.getRequestDispatcher("sqr");
//        rd.forward(req, resp);
    }
}
