package tut.ac.za.servlet;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tut.ac.za.ejb.bl.CalculatorEJBLocal;


public class MenuServlet extends HttpServlet {

     @EJB
     private CalculatorEJBLocal cl;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        char operator = req.getParameter("operator").charAt(0);

        if (operator == '+') {
            int c = cl.addition(a, b);
            req.setAttribute("c", c);

        } else if (operator == '-') {
            int c = cl.subtraction(a, b);
            req.setAttribute("c", c);

        } else if (operator == '*') {
            int c = cl.multiplication(a, b);
            req.setAttribute("c", c);
        } else {
            double c = cl.division(a, b);
            req.setAttribute("c", c);
        }

        RequestDispatcher disp = req.getRequestDispatcher("outcome.jsp");
        disp.forward(req, resp);

    }

}
