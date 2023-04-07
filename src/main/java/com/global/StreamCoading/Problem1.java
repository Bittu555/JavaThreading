package com.global.StreamCoading;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Problem1 {
	/*
	 public int id;
	public String name;
	private int sal;
	private double yearsInOrg;
	private String role;
	private String gender;
	 */

	public static void main(String[] args) {
	       List<Employee> employeeList = new ArrayList<Employee>(); 
	       employeeList.add(new Employee(1,"Bittu",25000,2,"Developer","male"));  
	       employeeList.add(new Employee(2,"ritu",25007,2.2,"TA","female"));  
	       employeeList.add(new Employee(3,"rahul",25000,2.8,"TA","male")); 
	       employeeList.add(new Employee(4,"ral",25000,2.8,"TA","male")); 
	       
	       
	        
	        List<String> ListOfrole =employeeList.stream()  
	                                     .filter(p->p.getRole()=="TA")// filtering data  
	                                     .map(p->p.getName())        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println("List of name as TA role : " +ListOfrole);  
	        
	        long count=employeeList.stream()
	        		.filter(a->a.getGender()=="female")
	        		.count();
	        
	        System.out.println("Number of female count : " +count); 
	        
//Write a java program using Stream API to count strings whose length is greater than three.	        
	        long countStringGreatThan3=employeeList.stream()
	        		.filter(a->a.getName().length()>3)
	        		.count();
	        System.out.println("Number of whose length > 3 count : " +countStringGreatThan3); 
//Write a java program using Stream API to convert the Strings from lower to uppercase
	        List<String> listofUpper=employeeList.stream()
	        		.map(a->a.getName().toUpperCase())
	        		 .collect(Collectors.toList());
	        System.out.println("In upperCase name : " +listofUpper); 
		
//Write a java program using Stream API to sort the 10 Strings stored in a list ?
	        List<String> sortedList = employeeList.stream()
	        		.map(a->a.getName())
	        		.sorted().collect(Collectors.toList());
	        System.out.println("sorted order : " +sortedList); 
	        
			     
	}

}
