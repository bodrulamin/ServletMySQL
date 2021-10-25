<%@page import="com.example.dao.UserDaoIml"%>
<%@page import="com.example.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getSession().getAttribute("user") == null) {
        response.sendRedirect("/views/login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <%@include file="bsHead.html" %>
    <body>
        <div class="container">
            <h1>Home</h1>
            <div class="row">
                <form action="addProduct">
                    Product Name :<input class="form-control" type="text" name="name"/> 
                    Product Price :<input class="form-control" type="text" name="price"/> 
                    Product Quantity :<input class="form-control" type="text" name="quantity"/> 
                    <button class="btn btn-primary">Add Product</button>
                </form>
            </div>
            Logged in as ${user.getUsername()}
            Password ${user.getPassword()}
            <a href="logout">Logout</a>
            ${n}
        </div>
        <%@include file="bsFoot.html" %>
    </body>
</html>