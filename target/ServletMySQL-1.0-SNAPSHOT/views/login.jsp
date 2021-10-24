<%-- 
    Document   : registrationpage
    Created on : Oct 20, 2021, 11:45:50 PM
    Author     : b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <%            
            if (request.getSession().getAttribute("user") != null) {
                response.sendRedirect("/views/home.jsp");
            }
        %>
        
        <h1>Login</h1>

        <form action="login" method="post">
            username <input type="text" name="username"><br><br>
            password <input type="text" name="password"><br><br>
            <button type="submit">Login</button>
        </form>

        ${result}
        ${param.username}

    </body>
</html>
