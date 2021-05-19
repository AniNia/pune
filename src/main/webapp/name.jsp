<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CIS: Add Corporate Name</title>
<%@ include file="common.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container">
<div class="row mt-2 mb-2">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-header text-white" style="background: maroon"><h3 class="text-center">Add Corporate Name</h3></div>
<%@ include file="message.jsp" %>

<div class="card-body px-4">

<form action="operation" method="post">
<input type="hidden" name="opsn" value="addname" />
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Corporate Name</label>
    <input required type="text" class="form-control" id="name" aria-describedby="emailHelp" name="name" placeholder="Enter Name">
  </div>
  <div class="container text-center">
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