package com.global.ParallelStreamCoading;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Comparable<Employee> ,Serializable{
	
	 private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private BigDecimal salary;
	
	public Employee(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {

//		if (o.getAge() > this.getAge()) {
//			return 1;
//		} else if (o.getAge() < this.getAge()) {
//			return -1;
//		}
//		return 0; 
		
		return this.getName().compareTo(o.getName());

	}
	
	
	
	
	

}
