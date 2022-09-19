package com.airways.spicejet.aviation.collection.day6;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//foodname, foodPRice 
		//key cannot be duplicated, 
		//value can be duplicated.

		HashMap foodMap = new HashMap();
		foodMap.put("burger", 100);
		foodMap.put("pizza", 150);
		foodMap.put("juice", 50);
		foodMap.put("burger", 20);//value gets replaced 
		System.out.println(foodMap);
		System.out.println(foodMap.get("pizza"));
		System.out.println(foodMap.containsKey("pasta"));
		System.out.println(foodMap.containsValue(20));
		System.out.println(foodMap.isEmpty());
		System.out.println(foodMap.size());
		System.out.println(foodMap.values());
		System.out.println(foodMap.keySet());
		System.out.println(foodMap.putIfAbsent("pizza", 1000));
		System.out.println(foodMap.putIfAbsent("pasta", 1000));
		System.out.println(foodMap.remove("juice"));
		foodMap.replace("pasta", 500);
		System.out.println(	foodMap.entrySet());
		System.out.println(foodMap);
	}

}
