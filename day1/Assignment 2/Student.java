package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Class : Printing the Student Name");
	}

	public void studentDept() {
		System.out.println("Student Class : Printing the Student Department");
	}
	
	public void studentID() {
		System.out.println("Stuent Class : Printing the Student ID");
	}

public static void main(String[] args) {
	Student stu = new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.deptName();
	stu.studentName();
	stu.studentDept();
	stu.studentID();
}
	
}
