import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
										throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>Hello Servlet</h3>");
		out.print("</body></html>");
	}

}
