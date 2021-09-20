package org.system;

public class StringCompare {

	public static void main(String[] args) {

		String s1 = "I am Learning Java";

		String s2 = "I am learning java? ";

		if (s1 == s2) {
			System.out.println("The string is Same");
		}

		else {
			System.out.println("The string is Different");
		}

		boolean s3 = s1.equals(s2);
		System.out.println(s3);
		s3 = s1.equalsIgnoreCase(s2);
		System.out.println(s3);

	}

}
