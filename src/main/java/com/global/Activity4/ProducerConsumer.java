package com.global.Activity4;

public class ProducerConsumer {

	public static void main(String[] args)  throws InterruptedException{

		DataContainer c=new DataContainer();
		
		Producer producer=new Producer(c);
		Consumer consumer=new Consumer(c);
		
		Thread pt1=new Thread(producer);
		Thread ct1=new Thread(consumer);
		
		pt1.start();
		ct1.start();
		
	}

}
