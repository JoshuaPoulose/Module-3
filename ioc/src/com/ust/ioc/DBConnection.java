package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements Connection {
	private String url;
	private String dbUserName;
	private String dbPassword;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getDbUserName() {
		return dbUserName;
	}


	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}


	public String getDbPassword() {
		return dbPassword;
	}


	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}


	public Connection getConnection() {
		try {
			java.sql.Connection con=DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("connect to my sql");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("getconnection called");
		return new DBConnection();
	}
	

}
