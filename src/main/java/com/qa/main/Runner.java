package com.qa.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Runner {
	public static void main(String[] args) {
		List<Integer> multiples = IntStream.range(1,2000).filter(a -> a%3==0 || a%5==0).boxed().collect(Collectors.toList());
		System.out.println(multiples.stream().reduce((acc,next) -> acc+next));
//		Fibonaci fib = new Fibonaci(1000);
//		System.out.println(fib.firstByDigits());
	}
}
