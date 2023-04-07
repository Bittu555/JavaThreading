package com.global.defaultProblem;

public class RegularPriviledgeCustomer {
    public static void main(String[] args) {
        // create regular customer
        RegularCustomer regularCustomer = new RegularCustomer();
        
        regularCustomer.addProduct(new Product("Shirt", 50));
        regularCustomer.addProduct(new Product("Pants", 70));
        
        double deliCharge= regularCustomer.chargeOnDelivery(13.0);
        
        double regularPurchaseAmount = regularCustomer.calculatePurchaseAmount();
        
        double total_Amount_regular=deliCharge+regularPurchaseAmount;
        
        System.out.println("Regular customer purchase amount: " + total_Amount_regular);

        // create privileged customer
        PrivilegedCustomer privilegedCustomer = new PrivilegedCustomer();
        privilegedCustomer.addProduct(new Product("Shirt", 110));
        privilegedCustomer.addProduct(new Product("Pants", 70));
        
        double privilegedPurchaseAmount = privilegedCustomer.calculatePurchaseAmount();
        
        double total_Amount_prevel=deliCharge+privilegedPurchaseAmount;
        
        System.out.println("Privileged customer purchase amount before discount: " + privilegedPurchaseAmount);
        
        privilegedPurchaseAmount = privilegedCustomer.discount(privilegedPurchaseAmount);
        
        System.out.println("Privileged customer purchase amount after discount: plus delivery charge " + total_Amount_prevel);
    }
}