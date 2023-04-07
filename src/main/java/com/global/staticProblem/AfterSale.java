package com.global.staticProblem;

public interface AfterSale {
	
	static double chargeOnDelivery(double value) {
	        
	    	return value;
	    }
	 static double discount(double amount) {
	        return amount * 0.95; // apply additional 5% discount for privileged customer
	    }

}
