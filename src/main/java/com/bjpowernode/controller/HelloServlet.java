package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
response.setContentType("text/html;charset=utf-8");
response.getWriter().print("hello maven web");
        response.getWriter().flush();
        response.getWriter().close();

    }
}
