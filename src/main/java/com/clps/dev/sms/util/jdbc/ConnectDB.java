/**
 * Project Name:study_java_j2se
 * File Name:TestConnectionDB.java
 * Package Name:com.cb.ads.sjj.user.eight
 * Date:2015年12月30日下午5:30:57
 * Copyright (c) 2015, erwin@163.com All Rights Reserved.
 *
 */

package com.clps.dev.sms.util.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;



/**
 * ClassName: TestConnectionDB <br/>
 * 
 * @author Jack.Huang
 * @version
 * @since JDK 1.8
 * @TestConnectionDB
 */
public class ConnectDB {


	static String driverClass = null;
	static String url = null;
	static String user = null;
	static String password = null;
	static {

		try {
			Properties properties = new Properties();
			//InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			InputStream is = new FileInputStream("jdbc.properties");
			properties.load(is);
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConn() {
		Connection connection = null;
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
		closeResultSet(resultSet);
		closeStatement(statement);
		closeConnect(connection);
	}
	public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
		closeResultSet(resultSet);
		closeStatement(statement);
		closeConnect(connection);
	}

	private static void closeResultSet(ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			resultSet = null;
		}
	}

	private static void closeStatement(Statement statement) {
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement = null;
		}
	}
	private static void closeStatement(PreparedStatement statement) {
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement = null;
		}
	}

	private static void closeConnect(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection = null;
		}
	}
}
