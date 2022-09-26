
package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kylan Kidd
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          request.setAttribute("Result", "---");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstnumber = request.getParameter("firstnumber");
        String secondnumber = request.getParameter("secondnumber");

       
        request.setAttribute("firstnumber", firstnumber);
        request.setAttribute("secondnumber", secondnumber);

    
        if (firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")) {
            request.setAttribute("Result", "invalid");

        } else if (request.getParameter("operation").equals("+")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 + number2;

            request.setAttribute("Result", + value);

        } else if (request.getParameter("operation").equals("-")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 - number2;

            request.setAttribute("Result", + value);
        } else if (request.getParameter("operation").equals("*")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 * number2;

            request.setAttribute("Result", + value);

        } else if (request.getParameter("operation").equals("%")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 % number2;

            request.setAttribute("Result", + value);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    
    }

 

}
