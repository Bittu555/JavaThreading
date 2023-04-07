package com.global.StreamCoading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> p=list.stream()
				.distinct()
				.map(a->a*a)
				.collect(Collectors.toList());
		System.out.println(p);
	}

}
