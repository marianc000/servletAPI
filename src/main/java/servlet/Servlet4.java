package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
 
@WebServlet({"/timeout"})
public class Servlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/plain");
        request.getSession().getMaxInactiveInterval();

        try ( PrintWriter out = response.getWriter()) {
            out.println("timeout: "+ request.getSession().getMaxInactiveInterval()/60);
        }
    }
}
