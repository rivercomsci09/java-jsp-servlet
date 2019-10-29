package com.river.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.river.dao.AccountDAO;
import com.river.model.Account;
import com.river.util.DBUtil;

public class AccountDAOImpl implements AccountDAO {

	public Connection getConnection() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/demo_db";
			String user = "root";
			String password = "914119";	
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			return null;
		} catch (SQLException e) {
			return null;
		}
	}

	public List<Account> findAllAccount() {
		List<Account> listAccount = new ArrayList<Account>();
		String sql = "SELECT * FROM account";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if (connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					Account account = new Account();
					account.setId(resultSet.getInt("id"));
					account.setUsername(resultSet.getString("username"));
					account.setEmail(resultSet.getString("email"));
					account.setPassword(resultSet.getString("password"));
					listAccount.add(account);
				}
				return listAccount;
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					}
				} catch (SQLException e) {
					return null;
				}
			}
		}
		return null;
	}
}
