package org.student;

import org.department.Department;

public class Student extends Department{

	String studentName="Mahalakhsmi";
	
	public void studentName() 
	{
		
	System.out.println("Student Name:" +studentName);

	}
	public void studentId() {
		
		int studentId=10;
		
		System.out.println("Student ID:" +studentId);

	}
	public void studentDept() {
		
		String studentDept="Testing";
				
		System.out.println("Student Dept:" +studentDept);

	}
		
	public static void main(String[] args) {
		
		Student st=new Student();
				
		
		st.studentName();
		st.studentId();
		st.studentDept();
		st.deptName();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		
	}
}

	