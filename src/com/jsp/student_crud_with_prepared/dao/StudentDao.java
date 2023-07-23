package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {

	Connection c=StudentConnection.getStudentConnection();
	
	/*
	 * insertMethod for Student 
	 */
	public Student insertStudent(Student student) {
		String insertQuery="insert into student values(?,?,?,?)";
		try {
			PreparedStatement p=c.prepareStatement(insertQuery);
			p.setInt(1, student.getStudentId());
			p.setString(2, student.getStudentName());
			p.setString(3, student.getStudentEmail());
			p.setLong(4, student.getStudentPhone());
			p.execute();
			
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		}return null;
	}
}
