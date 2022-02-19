package com.TypeCast.java;

public class TypeCasting {
	public static void main(String[] args) {
		//explicite casting
		System.out.println("explicite casting done");
		int x = 7;			
		long y = x;
		int z = (int) y;
		System.out.println(z);
		double d = 42.09;
		int e = (int)d;
		System.out.println(e);
		
		//Implicite casting
		System.out.println("implicite casting done");
		char a = 'A';
		int b = a;
		System.out.println(b);
		float c = a;
		System.out.println(c);
	}
}
