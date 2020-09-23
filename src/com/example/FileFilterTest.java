package com.example;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FileFilterTest {

	public static void main(String[] args) {

//		File[] files = new File("/Users/vinodkumarm").listFiles(new FileFilter() {
//			
//			@Override
//			public boolean accept(File file) {
//				return file.isHidden();
//			}
//		});
//		System.out.println(files.length);
		
		
		File[] files = new File("/Users/vinodkumarm").listFiles(File::isHidden);
		System.out.println(files.length);
		
//		Object o = (s) -> System.out.println(s);
		
		Predicate<Integer> p = (n) -> n>100;
		System.out.println(p.test(100));
		
		IntPredicate ip = (n) -> n>100;
		System.out.println(ip.test(99));
		
		Consumer<String> c = s -> System.out.println(s);
		c.accept("hiiii");
	}

}
