package org.system;

public class AxisBank extends BankInfo{

	public void depospit() {

		int d = 60000;

		System.out.println("My deposit amount is:" +d);
	}

	public static void main(String[] args) {

		AxisBank a= new AxisBank();
		
		a.saving();
		a.fixed();
		a.deposit();

	}

}
