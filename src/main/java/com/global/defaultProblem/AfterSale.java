package com.global.defaultProblem;

public interface AfterSale {
	//public double chargeOnDelivery(double value);
	 default double chargeOnDelivery(double value) {
	        // implementation for privileged customer
	    	return value;
	    }

}
