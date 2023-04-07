package com.global.Challange31March;

import java.util.concurrent.Executors;

import java.util.concurrent.ExecutorService;

  public class Activity6 implements Runnable {
	private int counter;	
        public Activity6(int counter) { 
               this.counter = counter; 
        }
	public int getCounter() {
		return counter;
	}
 
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int incrementCtr(){
		return counter++;
	}
@Override
public void run() {
		incrementCtr();
		System.out.println("Counter value:"+counter);		
	}

public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(2);
	
	Activity6 A1=new Activity6(1);
	Activity6 A2=new Activity6(9);
	
	executor.submit(A1);
	executor.submit(A2);
	
	executor.shutdown();
	
	
}
}

 
