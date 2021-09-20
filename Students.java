package org.system;

public class Students {

	public void getStudentInfo(int Id) {
		System.out.println("Student Id:" + Id);
	}

	public void getStudentInfo(int Id, String Name) {

		System.out.println("Student Id:" + Id);
		System.out.println("Student Name: " + Name);

	}

	public void getStudentInfo(String Email, long Phonenumber) {

		System.out.println("Student E-mail: " + Email);
		System.out.println("Student Phone Number: " + Phonenumber);
	}

	public static void main(String[] args) {

		Students s = new Students();
		s.getStudentInfo(100);
		s.getStudentInfo(200, "Mahalakshmi");
		s.getStudentInfo("pmlakhsmi14@gmail.com", 9566174865L);

	}

}
