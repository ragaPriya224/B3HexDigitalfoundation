package com.airways.spicejet.aviation.collection.day6.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

public class ExceptionDemo {

	public static void main(String[] args) {
				System.out.println("hello");
				try {
					
					///5 - 10 lines
					System.out.println(10/0);
					try {}
					catch() {
						
					}
				}catch(ArithmeticException e) {
					System.out.println("welcome user");
				}catch(ArithmeticException e) {
					System.out.println("welcome developer");
				}finally {
					System.out.println("it's finally block");
				}
		//		
				System.out.println("bye");


//		File file = new File("abc.txt");
//		FileInputStream stream = new FileInputStream(file);

	}
//code inside finally block, will definitely get executed. 
}
