<%-- 
    Document   : viewnote
    Created on : 8-Jun-2022, 4:18:54 PM
    Author     : Hayle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <p><strong>Title: ${note.title}</strong></p>
        <p><Strong>Contents:${note.content}</Strong></p>
        <p></p>
        
        <a href="note?edit"> 
    </body>
</html>
