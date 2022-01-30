package listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ServletContextListener1 implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(">contextInitialized1 " + sce.getServletContext().getInitParameter("contextParam"));
    }
}
