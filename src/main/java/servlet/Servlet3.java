package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
 
@WebServlet({"/trailer"})
public class Servlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setHeader("Trailer", "MyTrailer");

        try ( PrintWriter out = response.getWriter()) {
            out.println("This is body");

            response.setTrailerFields(() -> new HashMap<>() {
                {
                    put("MyTrailer", "trailerValue");
                }
            });
        }
    }
}
