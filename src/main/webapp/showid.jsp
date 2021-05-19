<%@page import="javax.persistence.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="dbconn.jsp" %>
<html lang="en">
<head>
<title>CIS : Show Corporate ID</title>
<%@ include file="common.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<h2 class="text-center mt-1" >Corporate Details</h2>
<%

%>


<div class="container mt-2">
<table class="table table-hover  table-striped">
<%@ include file="message.jsp" %>
 <thead>
    <tr>
      
      <th scope="col">Corporate Name</th>
      <th scope="col">Corporate ID</th>
      <th scope="col">Delete</th>
      
    </tr>
  </thead>
  
  <%
			String qr="select * from corpid ";
    		Statement st=con.createStatement();
    		  ResultSet rs=st.executeQuery(qr);	
			if(rs.next()){
				do{
				
					String name=rs.getString("corName");
					String id=rs.getString("cID");
			%>
  
  
  <tr>
      
      <td><%=name %></td>
      <td><%=id %></td>
      <td><a href="deletei?c_ID=<%=id %>&cor_Name=<%=name %>" class="btn btn-secondary btn-lg active btn-sm" role="button" aria-pressed="true">Delete</a></td>
    </tr>
    
    
    
    
      <%}while(rs.next());
				
			}
			
			
	 %>
</table>
</div>
</body>
</html>
