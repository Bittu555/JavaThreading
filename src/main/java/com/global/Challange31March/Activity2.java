package com.global.Challange31March;

class Activity2 implements Runnable{  
public void run(){  
System.out.println("Hello Thread...");  
}  
  
public static void main(String args[]){  
	
Activity2 m1=new Activity2();  

Thread t1 =new Thread(m1); 
Thread t2 =new Thread(m1); // Using the constructor Thread(Runnable r)  
Thread t3 =new Thread(m1);
Thread t4 =new Thread(m1);
Thread t5 =new Thread(m1);

t1.start();  
t2.start(); 
t3.start(); 
t4.start(); 
t5.start(); 
 }  
}  
