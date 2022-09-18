//java program to change the colour of the browser based on the button clicked
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ChangeColour")
public class ChangeColour extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String colour = request.getParameter("colour");
        out.println("<html><body bgcolor=" + colour + "></body></html>");
    }
}


