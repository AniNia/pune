package com.learn.servlets;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public operation() {
        super();
        // TODO Auto-generated constructor stub
    }

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String op=request.getParameter("opsn");
		if(op.trim().equals("addname")) {
			String cname=request.getParameter("name");
			try {
				//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/punet","root","root");
				String query="insert into name(cname) values(?)";
				java.sql.PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, cname);
				ps.executeUpdate();
				//PrintWriter out=response.getWriter();
				//out.println("Added Successfully");
				HttpSession httpSession=request.getSession();
					httpSession.setAttribute("message", "Added Sucessfully!!!!");
				    response.sendRedirect("name.jsp");
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
		else if(op.trim().equals("addid")) {
			String id=request.getParameter("id");
			String nm=request.getParameter("ids");
			try {
				//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/punet","root","root");
				String query="insert into corpid(cID,corName) values(?,?)";
				java.sql.PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, id);
				ps.setString(2, nm);
				
				ps.executeUpdate();
				//PrintWriter out=response.getWriter();
				//out.println("Added Successfully");
				HttpSession httpSession=request.getSession();
					httpSession.setAttribute("message", "Added Sucessfully!!!!");
				    response.sendRedirect("id.jsp");
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
		else if(op.trim().equals("addnumber")) {
			String idc=request.getParameter("num");
			String nmc=request.getParameter("ids");
			String ac=request.getParameter("acc");
			
			try {
				//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/punet","root","root");
				String query="insert into account(corporateName, corporateId, accountNum) values(?,?,?)";
				java.sql.PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, nmc);
				ps.setString(2, idc);
				ps.setString(3, ac);
				ps.executeUpdate();
				//PrintWriter out=response.getWriter();
				//out.println("Added Successfully");
				HttpSession httpSession=request.getSession();
				httpSession.setAttribute("message", "Added Sucessfully!!!!");
			    response.sendRedirect("number.jsp");
			    return;
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			
			
		}else {}
		
		
		
		
		
	}

}
