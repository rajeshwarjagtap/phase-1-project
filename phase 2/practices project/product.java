

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class searchinfo
 */
@WebServlet("/product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("proname");
		
		
		try {
		//Call Connection Method
			Connection con=DBConnection.getMyConnection();
          

			//to execute query create object of Statement
			java.sql.Statement  ps= con.createStatement();
			//get ResultSet
			
		int proid=Integer.parseInt(request.getParameter("proid"));
		String s=request.getParameter("proname");
		String p=request.getParameter("proprice");
		String q=request.getParameter("proavli");
			PrintWriter out=response.getWriter();
			out.println("product id "+proid);
			out.println("product name "+ s);
			out.println("product price "+p);
			out.println("product avaliablity"+q);
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
