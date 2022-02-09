

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empServlet
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int proid=Integer.parseInt(request.getParameter("proname"));
		String proname=request.getParameter("proname");
		String proPrice=request.getParameter("proPrice");
		String proavli=request.getParameter("proavli");
		try {
		//Call Connection Method
			Connection con=DBConnection.getMyConnection();
		//Write sql command
			String str="Insert into product (proId,proName,proPrice,proAvaliable) values(?,'?',?,?)";
			//String str= "update info set name=? where emailid=?";
			//to execute query create object of preparedSatement
			PreparedStatement  ps=con.prepareStatement(str);
			ps.setInt(1, proid);
			ps.setString(2, proname);
			ps.setString(3, proPrice);
			ps.setString(4, proavli);
			
			int ans =ps.executeUpdate();
			PrintWriter out=response.getWriter();
			if(ans>0)
				out.println("Record inserted");
			else
				out.println("Record not inserted");
			con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
