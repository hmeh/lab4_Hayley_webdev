<%-- 
    Document   : editnote
    Created on : 8-Jun-2022, 4:19:05 PM
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
         <form method="POST" action="edit">
            <p>Title: <input type="text" name="edit_title" value="${note.title}"></p>
            <p>Contents: <input type="text" name="edit_content" cols="30" rows="10" value="${note.content}"</p>
            <input type="submit" value="Save">
         </form>
    </body>
</html>
