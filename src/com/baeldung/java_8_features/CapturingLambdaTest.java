package com.baeldung.java_8_features;

public class CapturingLambdaTest {

	public static void main(String[] args) {

		final int portNumber = 1234;
		Runnable r = () -> { 
				System.out.println(portNumber);
//				portNumber = 100;
				System.out.println(portNumber);
			};
		r.run();
//		portNumber = 1;
		
	}

}
