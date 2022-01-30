package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
 
@WebServlet({"/servlet/*", "*.ext"})
public class Servlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        try ( PrintWriter out = res.getWriter()) {
            HttpServletMapping match = req.getHttpServletMapping();
            out.println("getMatchValue():\t" + match.getMatchValue());
            out.println("getPattern():\t\t" + match.getPattern());
            out.println("getServletName():\t" + match.getServletName());
            out.println("getMappingMatch():\t" + match.getMappingMatch());
        }
    }
}
