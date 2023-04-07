package com.global.CodingChallengeLambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSortByCountry {

	

	public static void main(String[] args) {
		List<Employee>  list=new ArrayList<>();
		list.add(new Employee(1,"bittu1","bihar"));
		list.add(new Employee(1,"bittu2","delhi"));
		list.add(new Employee(1,"bittu3","banglore"));
		list.add(new Employee(1,"bittu4","up"));
		list.add(new Employee(1,"bittu5","lucknow"));
		
		list.sort((emp1,emp2)->emp1.getCountry().compareTo(emp2.getCountry()));
		
		System.out.println(list);

		

	}

}
