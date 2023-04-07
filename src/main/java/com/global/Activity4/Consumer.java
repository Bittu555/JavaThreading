package com.global.Activity4;

class Consumer implements Runnable{
	private DataContainer container;
	
	public Consumer(DataContainer container) {
		this.container=container;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			int value=container.get();
			System.out.println("consumer consume:"+value);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
		}
		
	}
	

	}
}
