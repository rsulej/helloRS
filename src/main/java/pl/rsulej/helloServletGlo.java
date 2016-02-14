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
        res.getWriter().println("helloServletGlo RS!!<a href='./hello'>hello</a>");
        res.getWriter().println("2. helloServletGlo RS!!");
    }
}
