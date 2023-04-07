package com.global.Activity4;

import java.util.Random;

class Producer implements Runnable{
	private DataContainer container;
	
	private Random random=new Random();
	
	public Producer(DataContainer container) {
		this.container=container;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			int value=34;
			System.out.println("Producer produce:"+value);
			container.put(value);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
		}
		
	}
	

	}
}