package com.global.lock;

import com.global.demon.Demon;

public class Counter{

	  private Lock lock = new Lock();
	  private int count = 0;

	  public int inc() throws InterruptedException{
	    lock.lock();
	    int newCount = ++count;
	    lock.unlock();
	    return newCount;
	  }
	  
	  public static void main(String[] args) throws InterruptedException{  
		  Counter c=new Counter();
			System.out.println(c.inc());
	  }
	}

