package org.system;

class Desktop extends Computer {

	int size=25;

	public void desktopsize() {

		System.out.println("Desktop Size:" + size + "inch");

	}

	public static void main(String[] args) {

		Desktop S = new Desktop();
		
		S.computermodel();
		
		S.desktopsize();

	}
}
