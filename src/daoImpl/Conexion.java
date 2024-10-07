package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public static Conexion instancia;
	private Connection connection;
	
	private Conexion()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			this.connection.setAutoCommit(false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
