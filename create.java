package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class movieselect {
  public static void main(String[] args)
  {
    try
    {
    	Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver class loaded");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1124");
		System.out.println("Connection established");
      String query = "create table movies(movieName varchar(30) primary key,actor varchar(30) not null,actress varchar(30) not null,director varchar(10) not null,year int not null)";
      Statement stmt = con.createStatement() ;
      stmt.executeUpdate(query);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }

}