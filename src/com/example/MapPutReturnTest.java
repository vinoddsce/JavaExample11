package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapPutReturnTest {

	public static void main(String[] args) {

		Map<Integer, String> maps = new HashMap<Integer, String>();
		System.out.println(maps.put(1, "Vinod"));
		System.out.println(maps.put(1, "Kumar"));
	}

}
