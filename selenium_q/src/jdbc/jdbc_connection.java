package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_connection {
public static void main(String[] args) throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	Statement stat = con.createStatement();
	ResultSet res = stat.executeQuery("select * from selenium");
    while(res.next())
    {
    	String un = res.getString(1);
    	String pwd = res.getString(2);
    	System.out.println(un+" "+ pwd);
    }
}
}
