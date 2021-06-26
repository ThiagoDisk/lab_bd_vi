<%-- 
    Author: Fabrício Galende Marques de Carvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Retorno da verificação</title>
        <style>
            p{
                width: 50%;
                margin: auto;
                text-align: center;     
            }
            #arranjoParagraph{
                color: red;
            }
        </style>
    </head>
    <body>
        <p id="description"> Arranjo do número: (0 = não possui arranjo) </p>
        <p id="arranjoParagraph">
            <%=request.getAttribute("arranjo")%>
        </p>
    </body>
</html>
