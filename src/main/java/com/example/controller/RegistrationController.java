/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.controller;

import com.example.dao.UserDaoIml;
import com.example.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.dao.IUserDao;
 
 public class RegistrationController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("fullname") != null) {
            String fullname = req.getParameter("fullname");
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            User user = new User(0, fullname, username, password);

            IUserDao dao = new UserDaoIml();
            User savedUser = dao.save(user);

            if (savedUser != null) {
                req.setAttribute("result", "User Registration Successful <a href='login'>Login</a>");
            } else {
                req.setAttribute("result", "User Registration Failed!!!");
                req.setAttribute("result", UserDaoIml.lastMsg);
            
            }
        }

        getServletContext().getRequestDispatcher("/views/registration.jsp").forward(req, resp);

    }

}
