<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2022, 5:42:47 PM
    Author     : Kylan Kidd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="number" name="firstnumber" value="${firstnumber}"><br>
            Last: <input type="number" name="secondnumber" value="${secondnumber}"><br>
            <input type="submit" value="+" name="operation">
            <input type="submit" value="-" name="operation">
            <input type="submit" value="*" name="operation">
            <input type="submit" value="%" name="operation">
        </form>
        <p>Result:${Result}</p>
        <a href ="age"> Age Calculator</a> 
        
        
    </body>
</html>
