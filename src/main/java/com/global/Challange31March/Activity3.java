package com.global.Challange31March;

 class Activity3 extends Thread{    
 public void run(){    
  for(int i=1;i<=5;i++){   
  // the thread will sleep for the 500 milli seconds   
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}    
    System.out.println("Hello Thread");    
  }    
 }    
 public static void main(String args[]){    
  Activity3 t1=new Activity3();    
//  Activity3 t2=new Activity3();
  t1.setPriority(2);
  // t2.setPriority(5);
//  t3.setPriority(8);
  t1.start(); 
  System.out.println(
          "Currently Executing Thread : "
          + Thread.currentThread().getName());
     
  
//  t2.start(); 
//  System.out.println(
//          "Currently Executing Thread : "
//          + Thread.currentThread().getName());
     
 }    
}    
 
