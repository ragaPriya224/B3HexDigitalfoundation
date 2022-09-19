package com.airways.spicejet.aviation.collection.day6;

import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		
		
		int[] dataArray = new int[5];
		dataArray[3] =22;
		dataArray[1] = 45;
//		dataArray[2] = "hello";
		
		TreeSet<Integer> dataSet =new TreeSet<Integer>();
		dataSet.add(100);
		dataSet.add(115);
		dataSet.add(101);
		dataSet.add(104);
//		dataSet.add("A");  // error 
	}

}
