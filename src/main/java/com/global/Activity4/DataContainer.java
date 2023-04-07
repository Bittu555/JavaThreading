package com.global.Activity4;

public class DataContainer {
	private int intData;
	
	public synchronized int get(){
		
		while(intData==0){
			try{
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		int value=intData;
		intData=0;
		notifyAll();
		return value;	
}
		public synchronized void put(int value){
			while(intData!=0) {
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			intData=value;
			notifyAll();
		}
}

