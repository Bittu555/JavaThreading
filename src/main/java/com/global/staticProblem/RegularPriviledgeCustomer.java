package com.global.staticProblem;

public class RegularPriviledgeCustomer {
    public static void main(String[] args) {
        // create regular customer
    	
    	
        RegularCustomer regularCustomer = new RegularCustomer();
        
        regularCustomer.addProduct(new Product("Mobile", 10000));
        regularCustomer.addProduct(new Product("T-shirt", 900));
        
        double deliCharge= AfterSale.chargeOnDelivery(13.0);
        
        double regularPurchaseAmount = regularCustomer.calculatePurchaseAmount();
        
        double total_Amount_regular=deliCharge+regularPurchaseAmount;
        
        System.out.println("Regular customer purchase amount: " + total_Amount_regular);

        // for create privileged customer
        PrivilegedCustomer privilegedCustomer = new PrivilegedCustomer();
        privilegedCustomer.addProduct(new Product("chocalate", 110));
        privilegedCustomer.addProduct(new Product("biscuits", 710));
        
        double privilegedPurchaseAmount = privilegedCustomer.calculatePurchaseAmount();
        
        double total_Amount_prevel=deliCharge+privilegedPurchaseAmount;
        
        System.out.println("Privileged customer purchase amount before discount: " + privilegedPurchaseAmount);
        
        privilegedPurchaseAmount = AfterSale.discount(privilegedPurchaseAmount);
        
        System.out.println("Privileged customer purchase amount after discount: plus delivery charge " + total_Amount_prevel);
    }
}