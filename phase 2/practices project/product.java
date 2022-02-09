

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
           String str="select * from product where proName='"+name+"'";
          

			//to execute query create object of Statement
			java.sql.Statement  ps= con.createStatement();
			//get ResultSet
			
		
		ResultSet ans1 =((java.sql.Statement) ps).executeQuery(str);
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr><th>product Number</th></th><th>product Name</th><th>price</th><th>Avaliablity</th></tr>");
			while(ans1.next()) {
				out.println("<tr>");
				out.print("<td>"+ans1.getInt("proId")+"</td>");
				out.print("<td>"+ans1.getString("proName")+"</td>");
				out.print("<td>"+ans1.getString("proPrice")+"</td>");
				out.print("<td>"+ans1.getString("proAvaliable")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
