package com.example.demoapp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addStudent")
public class IdFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        int id = Integer.parseInt(req.getParameter("id"));
        if (id >= 1) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            out.println("Invalid id");
        }
    }

    @Override
    public void destroy() {
    }
}
