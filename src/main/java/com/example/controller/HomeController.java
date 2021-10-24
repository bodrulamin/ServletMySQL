package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("user") == null) {
            req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
        } else {
           // req.getSession().setAttribute("n", "bodrulvai");
            req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
        }

    }

}
