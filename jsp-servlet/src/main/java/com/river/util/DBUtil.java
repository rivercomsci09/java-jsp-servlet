package com.river.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/demo_db";
		String user = "root";
		String password = "914119";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection(url, user, password);
			return conn;
		} catch (ClassNotFoundException e) {
			return null;
		} catch (SQLException e) {
			return null;
		}
	}
}
