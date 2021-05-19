<%@page import="javax.persistence.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="dbconn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CIS: Add Corporate ID</title>
<%@ include file="common.jsp" %>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
<div class="row mt-2 mb-2">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-header text-white" style="background: maroon"><h3 class="text-center">Add Corporate ID</h3></div>
<%@ include file="message.jsp" %>
<div class="card-body px-4">

<form action="operation" method="post">
<input type="hidden" name="opsn" value="addid" />


   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Corporate Id</label>
    <input required type="text" class="form-control" id="id" aria-describedby="emailHelp" name="id" placeholder="Enter ID">
  </div>
  
  
           <div class="form-group mt-2">
            <label for="exampleInputEmail1" class="form-label">Enter Corporate Name</label>
        <select name="ids" id="nameid" class="form-control">
           <%
			String qr="select * from name";
    		Statement st=con.createStatement();
    		  ResultSet rs=st.executeQuery(qr);	
			if(rs.next()){
				do{
					String n=rs.getString("cname");
			%>
					
					
			<option value="<%=n%>">   <%=n %> </option>
					
					
	        <%}while(rs.next());
				
			}
			
			
	 %>
         
        
       
                </select>
  
         </div>
  
  
  
  <div class="container text-center mt-2">
  <button class="btn btn-outline-success" type="submit">Add</button>
  <button class="btn btn-outline-danger" type="reset">Reset</button>
  </div>
</form>
</div>
</div>
</div>
</div>
</div>

</body>
</html>