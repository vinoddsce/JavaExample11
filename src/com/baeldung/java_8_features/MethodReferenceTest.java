package com.baeldung.java_8_features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("a", "b", "A", "B");
		System.out.println(str);
//		str.sort( (s1, s2) -> s1.compareToIgnoreCase(s2));
		str.sort(String::compareToIgnoreCase);
		System.out.println(str);
		
	}

}
