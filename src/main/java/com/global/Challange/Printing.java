package com.global.Challange;


public class Printing {

	// Initializing volatile variables
	// a, b
	//static volatile int a = 0, b = 0;
  public static void first_Header() { System.out.print("first"); }
  public static void middle_body() { System.out.print("second"); }
  public static void footer() { System.out.print("third"); }


	// Defining a static void method
	

	// Defining static void method
	

	public static void main(String[] args)
	{

		// Creating an instance t1 of
		// Thread class
		Thread t1 = new Thread() {
			public void run()
			{
				first_Header();
			}
		};

		// Creating an instance t2 of
		// Thread class
		Thread t2 = new Thread() {
			public void run()
			{
				middle_body();
			}
		};
      Thread t3 = new Thread() {
			public void run()
			{
				footer();
			}
		};

		// Starting instance t1 and t2,t3 // we can use run() to call a methed in sequence Order !
		t1.start();
		t2.start();
        t3.start();
	}
}
