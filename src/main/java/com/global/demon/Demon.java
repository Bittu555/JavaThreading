package com.global.demon;



public class Demon extends Thread{  
	 public void run(){  
	  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
	   System.out.println("daemon thread work");  
	   
	  }  
	  else{  
	  System.out.println("user thread work");  
	 }  
	 }  
	 public static void main(String[] args){  
		 Demon t1=new Demon();//creating thread  
		 Demon t2=new Demon();  
		 Demon t3=new Demon();  
	  
	  t1.setDaemon(true);//now t1 is daemon thread  
	  t1.setPriority(t1.MAX_PRIORITY);
	 // System.out.println(t1.currentThread().getName());  
	    
	  //if i run t1,t2,t3 (then output according to that 
	  // but after setting priority then it will be run accoring to run pattern like when you w
	  // when you want to run demon that position will run .
	  
	  t2.start();//starting threads  
	  t1.start();  
	  t3.start(); 
	 // System.out.println(Thread.currentThread().getName());
	//  System.out.println(t1.currentThread().getName());  
	 }  
	}  
