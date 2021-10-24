package com.example.controller;

import com.example.dao.UserDaoIml;
import com.example.model.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.dao.IUserDao;

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") != null) {
            resp.sendRedirect("/views/home.jsp");
        } else {
            req.getSession().setAttribute("user", null);
            resp.sendRedirect("/views/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("user") == null) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            IUserDao dao = new UserDaoIml();
            User user = null;
            try {
                user = dao.getUser(username);
            } catch (NullPointerException ex) {
                req.setAttribute("result", UserDaoIml.lastMsg);
                req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
            }

            if (user != null) {
                if (password.equals(user.getPassword())) {
                    req.setAttribute("result", " Login Successful");
                    req.getSession().setAttribute("user", user);
                    resp.sendRedirect("/views/home.jsp");
                } else {
                    req.setAttribute("result", " Login Failed! Password wrong");
                    req.getRequestDispatcher("/views/login.jsp").forward(req, resp);

                }

            } else {
                req.setAttribute("result", UserDaoIml.lastMsg);
                req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
            }
        } else {
            resp.sendRedirect("/views/home.jsp");
        }

    }

}
