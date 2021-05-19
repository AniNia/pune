<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
<%@ include file="connection.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CIS: ADD NAME</title>
</head>
<body>


<%
String uname=request.getParameter("name");
String qr="insert into corname(cName) values(?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,uname);
int i=ps.executeUpdate();
if(i>0){%>
HttpSession httpSession=request.getSession();
			httpSession.setAttribute("message", "Corporate Name added successfully.");
			response.sendRedirect("name.jsp");
			return;
			
	
<% }%>

</body>
</html>