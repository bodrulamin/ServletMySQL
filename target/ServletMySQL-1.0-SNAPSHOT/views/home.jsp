<%-- 
    Document   : home
    Created on : Oct 23, 2021, 9:48:37 PM
    Author     : b
--%>

<%@page import="com.example.dao.UserDaoIml"%>
<%@page import="com.example.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home</h1>
        <%
            if (request.getSession().getAttribute("user") == null) {
                response.sendRedirect("/views/login.jsp");
            }
        %>
        <a href="logout">Logout</a>
        ${user.getUsername()}
        ${n}




    </body>
</html>
