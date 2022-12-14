package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kylan Kidd
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");

        request.setAttribute("age", age);

       
        if (age == null || age.equals("")) {
            request.setAttribute("Result","You must give your current age");
        } else {
            int age2 = Integer.parseInt(age);
            int nextAge = age2 + 1;
            request.setAttribute("Result", "Your next birthday will be " + nextAge);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }


}
