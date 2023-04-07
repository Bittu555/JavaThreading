package com.global.staticProblem;

import java.util.ArrayList;
import java.util.List;

class Customer {
	
	List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
     public double calculatePurchaseAmount() {
    		// TODO Auto-generated method stub
        	 double total=products.stream().map(p->p.getPrice()).reduce(0.0,(a,b)->a+b);
    		return total;
    	}
        
      
    // TODO Auto-generated method stub
  
        
        
        
}
