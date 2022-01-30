package listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ServletContextListener2 implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(">contextInitialized2");
        ServletContext sc = sce.getServletContext();
        System.out.println(sc.getSessionTimeout());
        sc.setSessionTimeout(30);
        System.out.println(sc.getRequestCharacterEncoding());
        System.out.println(sc.getResponseCharacterEncoding());

    }
}
