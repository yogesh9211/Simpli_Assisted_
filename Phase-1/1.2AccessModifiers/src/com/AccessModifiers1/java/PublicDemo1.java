package com.AccessModifiers1.java;
import com.AccessModifiers.java.PublicDemo;

class Public extends PublicDemo {
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
	public class PublicDemo1{

	public static void main(String[] args) {
		System.out.println("Public access modifier operation done");
		Public p = new Public();
		p.display();
		
	}
	}
