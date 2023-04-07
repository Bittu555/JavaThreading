package com.global.lock;

public class CounterWithThread implements Runnable {

	 private Lock lock = new Lock();
	 private int count = 0;
	  
	  
	  
	  public int inc() throws InterruptedException{
	    lock.lock();
	    int newCount = ++count;
	    lock.unlock();
	    return newCount;
	  }
	  
	  @Override
		public void run() {
		  try {
			inc();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("Counter value:"+count);		
			
		}

	  
	  public static void main(String[] args) throws InterruptedException{  
		 Counter c=new Counter();
		 System.out.println(c.inc());
	  }

	

}
