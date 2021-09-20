package org.system;

public class Assignment5 {

	public static void main(String[] args) {

		String str3 = new String("Kutty");

		String str4 = new String("Kutty");

		if (str3 == str4) {

			System.out.println(" Same text");
		}

		else

			System.out.println("Diff text");

		System.out.println("*");

		// == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
	}

}
