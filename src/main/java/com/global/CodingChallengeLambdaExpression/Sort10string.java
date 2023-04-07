package com.global.CodingChallengeLambdaExpression;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort10string {

	public static void main(String[] args) {
		List<String> tihList = Arrays.asList("patna", "delhi", "banglore", "lucknow", "bihar", "chandigarh");

		//using lambda expression
		//tihList.forEach(p -> System.out.println(p));
		List<String> sortedList = tihList.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);

	}

}
//List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

