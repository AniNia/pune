package com.learn.helper;
import java.sql.*;
public class jdbc_connection {
protected static Connection initializeDatabse() throws SQLException, ClassNotFoundException{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uniken","root","root");
	return con;
	
}


	

}
