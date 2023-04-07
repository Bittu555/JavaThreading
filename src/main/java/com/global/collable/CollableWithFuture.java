package com.global.collable;



import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

  public class CollableWithFuture implements Callable<Integer> {
	private int counter;	
        public CollableWithFuture(int counter) { 
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
		incrementCtr();
		//System.out.println("Counter value:"+counter);	
		
		// TODO Auto-generated method stub
		return incrementCtr();
	}


public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService executor=Executors.newSingleThreadExecutor();
	
	CollableWithFuture A1=new CollableWithFuture(1);
	CollableWithFuture A2=new CollableWithFuture(9);
	
	 
     Future<Integer> result1 = executor.submit(A1);
     
     
     Future<Integer> result2 = executor.submit(A2);
     
     Integer Incre1 = result1.get();
     System.out.println("increment of 1 of value 1 = " + Incre1);
     
     Integer Incre2 = result2.get();
     System.out.println("increment of 1 of value 9 = " + Incre2);
	
	executor.submit(A1);
	executor.submit(A2);
	
	executor.shutdown();
	
	
}

}

