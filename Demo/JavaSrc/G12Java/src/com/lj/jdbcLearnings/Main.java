package com.lj.jdbcLearnings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
		String sql =  "SELECT EMAIL FROM USER WHERE ID = 102";
		
		
		String url = "jdbc:mysql://localhost:3306/suretrusthms";
		String username = "root";
		String password = "L1j0j053ph";
		
		// step 4
		Connection con = DriverManager.getConnection(url, username, password);
		
		//step 5
		Statement st = con.createStatement();
		
		//step 6
		ResultSet rs = st.executeQuery(sql);
		
		// response
		rs.next();
		
		String name = rs.getString(1);
		System.out.println(name);
		
		//step 7
		con.close();
	}
}
