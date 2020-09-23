package com.baeldung.java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordAccurenceTest {

	public static void main(String[] args) {

		List<String> lines = new ArrayList<String>();
		lines.add("Hi Vinod");
		lines.add("Hi Hello");
		lines.add("Hello Vinod Kumar");
		
		
		Map<String, Integer> map = null;
		
		List<String[]> words = lines.stream().map(line -> line.split(" ")).collect(Collectors.toList());
		
//		Map<String, Long> frequencyMap = lines.stream()
//				  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
		Map<String, Long> frequencyMap = lines.stream().flatMap(line -> Arrays.stream(line.split(" ")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(frequencyMap);
		System.out.println(lines.stream().flatMap(line -> Arrays.stream(line.split(" "))).collect(Collectors.toList()));
	}

}
