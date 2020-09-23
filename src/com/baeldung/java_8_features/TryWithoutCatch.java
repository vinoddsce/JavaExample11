package com.baeldung.java_8_features;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutCatch {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			System.out.println(openFile());
		} catch (NullPointerException | IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	private static String openFile() throws IOException {
		BufferedReader reader = null;
		try {
			File file = new File("/Users/vinodkumarm/Documents/workspace-spring-tool-suite-4-4.6.2.RELEASE/JavaExample11/src/com/baeldung/java_8_features/test.txt");
			FileReader fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
//			System.out.println(reader.readLine());
			System.exit(0);
			System.out.println("Done with openFile() try");
			return reader.readLine();
			
		} finally {
			System.out.println("Start with openFile() finally");
			reader.close();
			System.out.println("Done with openFile() finally");
		}
	}

}
