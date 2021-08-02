package com.example.demoapp;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        int k = 0;

        Cookie[] cookies = req.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("k")) {
                k = Integer.parseInt(c.getValue());
            }
        }

        k = k * k;

        PrintWriter out = resp.getWriter();
        out.println("Result is " + k);
    }
}
