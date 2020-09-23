package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


class Car {
	int id;
	String name;
	
	Car(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class LamdaTest {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(9);
		numbers.add(33);
		numbers.add(56);
		numbers.add(77);
		numbers.add(81);
		numbers.add(4);
		
		
//		numbers.sort((n1, n2)-> n1.compareTo(n2));
		
		Collections.sort(numbers, Integer::compareTo);
		System.out.println(numbers);
		
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car(1, "Polo"));
		cars.add(new Car(10, "Desire"));
		cars.add(new Car(4, "Jazz"));
		
		Collections.sort(cars, Comparator.comparing(Car::getName));
		System.out.println(cars);
		
		
		Predicate<Car> pCar = c -> "Polo".equals(c.getName());
		System.out.println(cars.stream().filter(pCar));
	}

}
