<%-- 
    Document   : outcome
    Created on : Aug 6, 2024, 3:32:12 PM
    Author     : teffu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome</title>
    </head>
    <body>
        <h1>Outcome</h1>

        <%
            int c = (Integer) request.getAttribute("c");
        %>

        <p>
            <b>Total: </b> <%=c%>
        </p>

        Click <a href="index.html">here</a> to go back to the main page.
    </body>
</html>
