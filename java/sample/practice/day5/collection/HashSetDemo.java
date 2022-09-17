package com.airways.spicejet.aviation.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet foodSet = new HashSet();
		foodSet.add("pizza");
		foodSet.add("sandwich");
		foodSet.add("milkshake ");
		foodSet.add("pizza"); //duplicate not allowed
		foodSet.add("icecream");
		foodSet.add(34234); //heterogenous data 
//	
System.out.println(foodSet);
		
	}

}