package com.jsp.student_crud_with_prepared.dao.controller;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		Student student= new Student(100,"Kunal","qw@gmail.com",827787);
	 
		StudentDao studentDao= new StudentDao();
		studentDao.insertStudent(student);
	}
}
