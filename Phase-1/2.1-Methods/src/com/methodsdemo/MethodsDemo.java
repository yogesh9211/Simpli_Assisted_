package com.methodsdemo;

class B {
	int i=5;
}

 // Java , copy by value
class A {
	void test(B b) {
		b.i++;
	}
}
public class MethodsDemo {
	public static void main(String[] args) {
		A a = new A();
		B b = new B(); 
		
		a.test(b);
		System.out.println("Method opertaion performed");
		System.out.println(b.i);
		
	}

}

