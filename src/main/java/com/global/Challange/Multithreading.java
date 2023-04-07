package com.global.Challange;

public class Multithreading extends Thread {
	public void run() {
		System.out.println("thread Operation");
		
			

	}

	public static void main(String[] args) {
		Multithreading thread1=new Multithreading();
		Multithreading thread2=new Multithreading();
		Multithreading thread3=new Multithreading();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
