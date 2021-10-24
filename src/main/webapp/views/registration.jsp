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
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Registration</h1>
        
        <form action="register" method="POST">
            fullname: <input type="text" name="fullname"><br><br>
            username <input type="text" name="username"><br><br>
            password <input type="text" name="password"><br><br>
            <button type="submit">Register</button>
        </form>
        
        ${result}
        
    </body>
</html>
