

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class uservalidation
 */
@WebServlet("/uservalidation")
public class uservalidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pword=request.getParameter("pass");
		if(uname.equalsIgnoreCase("Rajeshwar") && pword.equals("Raj@123")) {
			
			RequestDispatcher rd=request.getRequestDispatcher("info.jsp");
			rd.forward(request, response);
		}
		else
		{
			PrintWriter out=response.getWriter();
			
			out.println("invalid username and Password");
			RequestDispatcher rd=request.getRequestDispatcher("loginform");
			rd.include(request, response);
			
		}
	}

}
