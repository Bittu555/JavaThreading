package com.global.collable;



import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

  public class Collable1 implements Callable<Object> {
	private int counter;	
        public Collable1(int counter) { 
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
	public Object call() throws Exception {
		incrementCtr();
		System.out.println("Counter value:"+counter);	
		
		// TODO Auto-generated method stub
		return null;
	}
//@Override
//public void run() {
//		incrementCtr();
//		System.out.println("Counter value:"+counter);		
//	}

public static void main(String[] args) {
	ExecutorService executor=Executors.newSingleThreadExecutor();
	
	Collable1 A1=new Collable1(1);
	Collable1 A2=new Collable1(9);
	
	executor.submit(A1);
	executor.submit(A2);
	
	executor.shutdown();
	
	
}

}

 



