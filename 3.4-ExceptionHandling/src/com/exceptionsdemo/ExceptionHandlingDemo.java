package com.exceptionsdemo;

public class ExceptionHandlingDemo {
public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		String s = null;
		
		try {
			int c = a/b;	
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Exception occurred, please contact to admin");
		} catch(Exception e) {
			System.out.println("Generic exception");
		} finally {
			
			System.out.println("Finally block executed");
		}
		
		
		System.out.println("End of program");
}
}
