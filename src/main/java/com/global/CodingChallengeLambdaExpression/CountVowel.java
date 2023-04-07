package com.global.CodingChallengeLambdaExpression;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class CountVowel {

	public static void main(String[] args) {
		String str1="my name is bittu";
	   Function<String,Integer> function=(str)->(str.replaceAll("[^AEIOUaeiou]","").length());
	  System.out.println(function.apply(str1));

	}

}
