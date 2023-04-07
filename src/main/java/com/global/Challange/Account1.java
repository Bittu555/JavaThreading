package com.global.Challange;
/*
Activity 1 
  
Create class Account which must have deposit and withdraw functionality. 
While creating an object of Account class, if the user entered value for
amount is negative, then throw InvalidArgumentException, while withdrawing,
after withdrawing if available balance is <500 then throw LowBalanceException.


Activity 2


Modify above problem statement and Create 2 threads 
husband and wife. Husband should be able to deposit 
money in the account  and the wife should be able to withdraw money from the account.


 If the husband is in execution then the wife must be 
 in a waiting state, similarly if the wife is executing first 
 then the husband should be in a waiting state. 
 After completion of transaction give notification to another thread.


Create a Java Application for the  above statement.

 */

public class Account1 {
	 public static void deposit() { System.out.print("Deposite"); }
	 public static void withdraw() { System.out.print("withdraw"); }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
