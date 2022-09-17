package com.airways.spicejet.aviation.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet foodSet = new LinkedHashSet();
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