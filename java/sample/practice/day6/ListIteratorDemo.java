package com.airways.spicejet.aviation.collection.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(3);
		markList.add(5);
		markList.add(6);
		markList.add(7);

		 ListIterator<Integer> iterator = markList.listIterator();
//		iterator.
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

//		Iterator<Integer> iterator2 = markList.iterator();
//		while(iterator2.hasNext()) {
//			System.out.println(iterator2.next());
//		}
	}
}

//list iterator -> forward operations/ backward operations, replace also. 

//split iterator -> parallel 
//wrapper class