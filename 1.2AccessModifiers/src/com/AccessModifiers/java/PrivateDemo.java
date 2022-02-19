package com.AccessModifiers.java;
class A {
	private int data = 40;
	private int data1 = 50;
	void demo() {
		System.out.println(data);
		System.out.println(data1);
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		System.out.println("Private access modifier operation done");
		A a = new A();
		a.demo();
	}
}
