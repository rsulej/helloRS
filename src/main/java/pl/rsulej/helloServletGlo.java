package pl.rsulej;

        import javax.servlet.GenericServlet;
        import javax.servlet.ServletException;
        import javax.servlet.ServletRequest;
        import javax.servlet.ServletResponse;
        import javax.servlet.annotation.WebServlet;
        import java.io.IOException;

@WebServlet(value="/", name="helloServletGlo")
public class helloServletGlo extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<html>");
        res.getWriter().println("<head><title>Hello World Servlet</title></head>");
        res.getWriter().println("<body>");
        res.getWriter().println("<h1>Hello World! <a href='./hello'>hello</a></h1>");
        res.getWriter().println("</body>");
        res.getWriter().println("</html>");
        res.getWriter().close();

    }
}
