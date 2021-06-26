<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title> Formulário Simples </title>
        <meta charset="utf-8">
        <style>
            form{
                width: 50%;
                margin: auto;
                text-align: center;     
            }

        </style>
    </head>
    <body>
        <form method="post" 
         action="arranjo.action">
            Digite dois números para verificar seu arranjo: <input name="number1"/>
            <input name="number2"/>

            <input id="dataSender" type="submit">
        </form>
    </body>    
</html>