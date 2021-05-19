package com.learn.servlets;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class deletea extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletea() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/punet","root","root");
		    String name=request.getParameter("cor_Name").trim();
		    String id=request.getParameter("cor_id").trim();
		    String num=request.getParameter("cor_acc").trim();
		    
		    String remn="delete from account where corporateName=?  and corporateId=? and accountNum=?";
		   PreparedStatement ps=con.prepareStatement(remn);
		   ps.setString(1, name);
		   ps.setString(2, id);
		   ps.setString(3, num);
			
			
		      ps.executeUpdate();
			HttpSession httpSession=request.getSession();
				httpSession.setAttribute("message", "deleted Sucessfully!!!!");
			    response.sendRedirect("showfull.jsp");
			    return;
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	
}

}
