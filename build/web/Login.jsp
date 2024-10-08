
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            input[type="text"],input[type="password"]{
                width:220px;
                height:40px;
                margin-bottom: 10px;
            }
            input[type="submit"],input[type="reset"]{
                width:100px;
                height:40px;
                color:white;
                background-color:green;
                margin-right: 10px;
            }
        </style>
    </head>
    <body>
    <center>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="username" required><br>
            <input type="password" name="password" placeholder="password" required><br>
            <input type="submit" value="LOGIN">
            <input type="reset" value="RESET">
        </form>
    </center>
    </body>
</html>
