package com.global.lock;


/////

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

  public class CounterWithFuture implements Callable<Integer> {
	private int counter;	
	private static ReentrantLock lock=new ReentrantLock();
        public CounterWithFuture(int counter) { 
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
	public Integer call() throws Exception {
		lock.lock();
		try {
			int count= incrementCtr();
		System.out.println("Counter value :"+count);	
		return count;
		
		}finally
		{
			lock.unlock();// TODO Auto-generated method stub
		}
		
	}


public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService executor=Executors.newFixedThreadPool(5);
//	CounterWithFuture A1=new CounterWithFuture(1);
//	CounterWithFuture A2=new CounterWithFuture(9);
	
	Future<Integer> result1 = executor.submit(new CounterWithFuture(1));
//	Integer Incre1 = result1.get();
	Future<Integer> result2 = executor.submit(new CounterWithFuture(2));
//	Integer Incre2 = result2.get();
	
	Future<Integer> result3 = executor.submit(new CounterWithFuture(3));
	//Integer Incre3 = result3.get();
	Future<Integer> result4 = executor.submit(new CounterWithFuture(4));
	//Integer Incre4 = result4.get();
	Future<Integer> result5 = executor.submit(new CounterWithFuture(5));
	//Integer Incre5 = result5.get();
	
	
	 
     
     
    
     
     
     
     
//     Integer Incre2 = result2.get();
//     System.out.println("increment of 1 of value 2 = " + Incre2);
//     Integer Incre3 = result3.get();
//     System.out.println("increment of 1 of value 3 = " + Incre3);
//     
//     Integer Incre4 = result4.get();
//     System.out.println("increment of 1 of value 4 = " + Incre4);
//     Integer Incre5 = result5.get();
//     System.out.println("increment of 1 of value 5 = " + Incre5);
//     
    
	
//	executor.submit(A1);
//	executor.submit(A2);
	
	executor.shutdown();
	
	
}

}

