package com.jsp.student_crud_with_prepared.dto;

/**
 * 
 * @author kunal
 *
 */

public class Student {

	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhone;
	public Student() {
		super();
	}
	
	//ALT + SHIFT + S + R ===>for getter/setter methods. 
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	
	//ALT + S + A ===> For parameterized constuctor
	public Student(int studentId, String studentName, String studentEmail, long studentPhone) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
	}
	//ALT + SHIFT + S + S + A ===> toString Method

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentPhone=" + studentPhone + ", getStudentId()=" + getStudentId() + ", getStudentName()="
				+ getStudentName() + ", getStudentEmail()=" + getStudentEmail() + ", getStudentPhone()="
				+ getStudentPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentId(1001);
		s1.setStudentName("Raahul");
		s1.setStudentEmail("010@gmail.com");
		s1.setStudentPhone(70507);
		System.out.println(s1.getStudentId()+" "+ s1.getStudentName());
	}
}
