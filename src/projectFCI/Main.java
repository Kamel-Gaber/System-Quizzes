package projectFCI;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.plaf.SliderUI;

public class Main {
	static Connection connection  ;
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		LogIn login = new LogIn();
		String url = "jdbc:mysql://localhost:3306/my_fci_database" ; 
		String username = "root";
		String password = "123456";
	
		try {
			Connection connection = DriverManager.getConnection(url, username, password) ;
			 System.out.println("DONE");
			
			
			 
		} catch (SQLException e) {
		 System.out.println("opppps , error  !!!!");
			e.printStackTrace();
		}
		
		
		
		
		
	}
	}
		
	


