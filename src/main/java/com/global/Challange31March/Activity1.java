package com.global.Challange31March;

/*
class Activity1 extends Thread{  
public void run(){  
System.out.println("Hello Threads");  
}  
public static void main(String args[]){  
	Activity1 t1=new Activity1();  
t1.start();  
 }  
}
*/


 public class Activity1 {
   public static void main(String[] args) {
      MyThread t1 = new MyThread();
      MyThread t2 = new MyThread();
      MyThread t3 = new MyThread();
      MyThread t4 = new MyThread();
      MyThread t5 = new MyThread();
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
   }
}
class MyThread extends Thread {
   @Override
   public void run() {
      System.out.println("Hello Thread ...");
   }
}
 
