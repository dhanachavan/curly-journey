//servlet to display the html file
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ChangeColourServlet")
public class ChangeColourServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Change Colour</h1>");
        out.println("<a href=ChangeColour.html>Click here to change the colour</a>");
        out.println("</body></html>");
    }
}