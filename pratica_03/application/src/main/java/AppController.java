/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/arranjo.action"})
public class AppController extends HttpServlet {

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res){
       int number1 = Integer.valueOf(req.getParameter("number1"));
       int number2 = Integer.valueOf(req.getParameter("number2"));
       Calculadora c = new Calculadora();
       int arranjo = c.arranjo(number1,number2);
       ServletContext sc = req.getServletContext();
       try{
            req.setCharacterEncoding("UTF-8");
            res.setContentType("text/html");
            res.setCharacterEncoding("UTF-8");
            req.setAttribute("arranjo", arranjo);
            sc.getRequestDispatcher("/jsp/response.jsp").forward(req, res);
       }catch (Exception e){}      
   }
}
