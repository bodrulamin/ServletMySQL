
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getSession().getAttribute("user") != null) {
        response.sendRedirect("/views/home.jsp");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <%@include file="bsHead.html" %>

    </head>
    <body>


        <div class="container">


            <h1>Login</h1>

            <form action="login" method="post">
                username <input class="form-control" type="text" name="username">
                password <input class="form-control" type="text" name="password">
                <button class="btn btn-primary" type="submit">Login</button>
                <a href="register" class="btn btn-warning" >Register</a>
            </form>
        </div>
        ${result}
        ${param.username}
        <%@include file="bsFoot.html" %>

    </body>
</html>
