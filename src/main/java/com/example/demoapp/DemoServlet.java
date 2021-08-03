package com.example.demoapp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> students = Arrays.asList(
                new Student(1, "Teo"),
                new Student(2, "Jack"),
                new Student(3, "Chris")
        );
        Student student = new Student(0, "Single");
        req.setAttribute("student", student);
        req.setAttribute("students", students);
        RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
        dispatcher.forward(req, resp);

    }
}
