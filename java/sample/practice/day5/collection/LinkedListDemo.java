package com.airways.spicejet.aviation.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList foodList = new LinkedList();
		foodList.add("pizza");
		foodList.add("sandwich");
		foodList.add("milkshake ");
		foodList.add("pizza"); //dup allowed
		foodList.add("icecream");
//		foodList.add(34234); //heterogenous data 
//		foodList.add(false);
//		foodList.add(null);
		System.out.println(foodList);
		System.out.println(foodList.getLast());
		System.out.println(foodList.getFirst());
		foodList.removeFirst();
		System.out.println(foodList);
		foodList.removeLast();
		System.out.println(foodList);
		foodList.addFirst("pasta");
		System.out.println(foodList);
		foodList.addLast("burger");
		System.out.println(foodList);

		
	}

}