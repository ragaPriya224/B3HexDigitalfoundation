package com.airways.spicejet.aviation.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList foodList = new ArrayList();
		foodList.add("pizza");
		foodList.add("sandwich");
		foodList.add("milkshake ");
		foodList.add("pizza"); //dup allowed
		foodList.add("icecream");
		foodList.add(34234); //heterogenous data 
		foodList.add(false);
		foodList.add(null);
		foodList.add("pasta");
		System.out.println(foodList);
		foodList.remove("sandwich");
		System.out.println(foodList);
		//		foodList.clear();

		System.out.println(foodList.size());
		System.out.println(foodList.contains("juice"));
		System.out.println(foodList.isEmpty());
		System.out.println(foodList.get(3));
		foodList.add(2, "frenchfries");
		System.out.println(foodList);
		foodList.set(1, "coke");  //replace/update
		System.out.println(foodList);
		foodList.remove(8);
		System.out.println(foodList);
		System.out.println(foodList.indexOf("pizza"));
		System.out.println(foodList.lastIndexOf("pizza"));
		
		ArrayList lunchList = new ArrayList();
		lunchList.add("briyani");
		lunchList.add("chapathi");
		lunchList.add("abc");
		
		
		foodList.addAll(2,lunchList);
	
		System.out.println(foodList);
		System.out.println(foodList.subList(1, 4));
		
	}

}