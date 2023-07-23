package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {

	public static Connection getStudentConnection() {
		try {
			//STEP-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//STEP-2
			String url="jdbc:mysql://localhost:3306/jdbc-preparedst";
			String user="root";
			String pass="0987";
			Connection c=DriverManager.getConnection(url, user, pass);
			
			return c;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
