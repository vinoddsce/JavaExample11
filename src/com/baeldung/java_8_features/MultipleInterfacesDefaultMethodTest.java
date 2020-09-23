package com.baeldung.java_8_features;

//A simple Java program to demonstrate multiple 
//inheritance through default methods. 
interface TestInterface1 {
	
	void m1();
	
	// default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	
	void m1();
	
	// Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

// Implementation class code 
class TestClass implements TestInterface1, TestInterface2 {
	// Overriding default show method
	public void show() {
		
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		
		System.out.println("TestClass show() impl !!!!");

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}
	
	public void m1() {
		TestInterface2.super.show();
		System.out.println("TestClass m1() impl !!!!");
		TestInterface2.super.show();
	}
}

public class MultipleInterfacesDefaultMethodTest {

	public static void main(String[] args) {
		TestClass d = new TestClass(); 
        d.show(); 
        d.m1();
	}

}
