package com.example;


enum Colors {
	
	R(100), B(200), G(300);
	int value;
	
	private Colors(int value) {
		System.out.println(value);
		this.value = value;
	}
	
	int valueOf() {
		return value;
	} 
}


public class PrivateEnum {

	public static void main(String[] args) {
		
		System.out.println(Colors.R.valueOf());
		
	}

}
