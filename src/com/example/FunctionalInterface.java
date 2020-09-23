package com.example;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;

interface A1 {
	public void m1();
	default void test() {
		System.out.println("interface default test() !!!!! ");
	}
	default int numberTest() {
		System.out.println("interface default numberTest() !!!!! ");
		return 100;
	}
	static void staticTest() {
		System.out.println("interface static staticTest() !!!!! ");
	}
	static int staticNumberTest() {
		System.out.println("interface static staticNumberTest() !!!!! ");
		return 100;
	}
}

interface B1 extends A1 {
	public void m1();
}

class ConcreteA1 implements A1 {

	@Override
	public void m1() {
		System.out.println("interface m1() implemented !!!!! ");
	}
	
}

public class FunctionalInterface {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Start !!!!!");
		
//		for (int i=0; true; i++) {
//			System.out.println("Value : " + i);
//		}
		
		A1.staticTest();
		System.out.println("A1.staticNumberTest(): " + A1.staticNumberTest());
		
		A1 obj = new ConcreteA1();
		obj.m1();
		obj.test();
		obj.numberTest();
		
		
		
		Callable<Integer> c = () -> 42;
		PrivilegedAction<Integer> p = () -> 42;
		
		c.call();
		p.run();
		
		c = (Callable<Integer>) p;
		c.call();
		
		System.out.println("End");
	}
}
