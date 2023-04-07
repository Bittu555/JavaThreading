package com.global.CodingChallengeLambdaExpression;




//Java code to explain how to generate random
//password

//Here we are using random() method of util
//class in Java
import java.util.*;
import java.util.function.Supplier;

public class GenerateOTPp3
{
	public static void main(String[] args)
	{
//		Supplier<String> otpsupplier=()->{
//			String otp="";
//			for(int i=0;i<9;i++)
//			{
//				otp=otp+(int)(Math.random()*10);
//			}
//			return otp;
//		};
//		
//		System.out.println("otp :"+otpsupplier.get());
		//#####################################################################
		
UUID id=UUID.randomUUID();
System.out.println(id);

	
	}
}
