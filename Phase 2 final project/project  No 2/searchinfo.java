

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
@WebServlet("/searchinfo")
public class searchinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source=request.getParameter("source");
		String distination=request.getParameter("disti");
		
		try {
		//Call Connection Method
			Connection con=DBConnection.getMyConnection();
           String str="select * from flight where depature='"+source+"' and arrival='"+distination+"' ";
          

			//to execute query create object of Statement
			java.sql.Statement  ps= con.createStatement();
			//get ResultSet
			
		
		ResultSet ans1 =((java.sql.Statement) ps).executeQuery(str);
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr><th>Flight No</th></th><th>depature</th><th>arrival</th><th>time</th></tr>");
			while(ans1.next()) {
				out.println("<tr>");
				out.print("<td>"+ans1.getInt("flightNo")+"</td>");
				out.print("<td>"+ans1.getString("depature")+"</td>");
				out.print("<td>"+ans1.getString("arrival")+"</td>");
				out.print("<td>"+ans1.getString("time")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
