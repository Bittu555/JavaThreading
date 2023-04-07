package com.global.ParallelStreamCoading;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;



public class Problem2 {
	/*
Using the above employee class do the following operations
❖ Create a list of employees.
❖ From the list of employees, you need to filter all the employees whose age is greater
then 20 and print the employee names.
❖ From the list of employees, count the number of employees with an age 25?
❖ From the list of employees, find the employee with the name “Mary”.
❖ From the list of employees, find the maximum age of the employee?
❖ From the list of employees, sort all the employees on the basis of age?
	 */

	public static void main(String[] args) {
	       List<Employee> employeeList = new ArrayList<>(); 
	       employeeList.add(new Employee("Bittu",19,BigDecimal.valueOf(5.4)));  
	       employeeList.add(new Employee("ramu",95,BigDecimal.valueOf(5.4)));  
	       employeeList.add(new Employee("Marry",25,BigDecimal.valueOf(5.4)));  
	       
	       
	        //❖ Create a list of employees.
	        List<String> ListOfrole =employeeList.stream()  
	                                     //.filter(p->p.getRole()=="TA")// filtering data  
	                                     .map(p->p.getName())        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println("List of Employee : " +ListOfrole);  
	        
	        //❖ From the list of employees, you need to filter all the employees whose age is greater
	      //  then 20 and print the employee names.
	        List<String> ListOfrole2 =employeeList.stream()  
                    .filter(p->p.getAge()>20)// filtering data  
                    .map(p->p.getName())        // fetching price  
                    .collect(Collectors.toList()); // collecting as list  
	        System.out.println("List of Employee age> 20 : " +ListOfrole2);  

//❖ From the list of employees, count the number of employees with an age 25?
	        List<String> ListOfrole3 =employeeList.stream()  
	        		.filter(p->p.getAge()==25)// filtering data  
	        		.map(p->p.getName())        // fetching price  
	        		.collect(Collectors.toList()); // collecting as list  
	        System.out.println("List of Employee age is 25 : " +ListOfrole3);  
	        
//❖ From the list of employees, find the employee with the name “Mary”.	        
	        List<String> ListOfrole4 =employeeList.stream()  
	        		.filter(p->p.getName().equals("Marry"))// filtering data  
	        		.map(p->p.getName())        // fetching price  
	        		.collect(Collectors.toList()); // collecting as list  
	        System.out.println("List of Employee name is Marry : " +ListOfrole4);  


	        //❖ From the list of employees, find the maximum age of the employee?
    Employee employee = employeeList.stream().max((product1, product2)->product1.getAge() > product2.getAge() ? 1: -1).get();    
    System.out.println("maximum age of employeer : "+employee.getAge());    
    
    
    
    //❖ From the list of employees, sort all the employees on the basis of age?
    Iterator<Employee> it = employeeList.iterator();
    
    Comparator<Employee> compareByAge = (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName());
       Collections.sort(employeeList, compareByAge);
       
       System.out.println("sorting employee by Name  ");
		it = employeeList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}       
			     
	}

}

