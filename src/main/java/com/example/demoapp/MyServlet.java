package com.example.demoapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        PrintWriter out = resp.getWriter();
        out.println("Hi ");

        ServletContext context = getServletContext();
        String name = context.getInitParameter("name"); // Teo

//        ServletConfig config = getServletConfig();
//        String name = config.getInitParameter("name"); // Sukesh

        out.println(name);
    }
}
