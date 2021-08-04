package com.example.demoapp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addStudent")
public class NameFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String name = req.getParameter("name");
        if (name.length() >= 3) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            out.println("Invalid name");
        }
    }

    @Override
    public void destroy() {
    }
}
