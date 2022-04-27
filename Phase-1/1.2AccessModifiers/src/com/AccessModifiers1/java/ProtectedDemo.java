package com.AccessModifiers1.java;

import com.AccessModifiers.java.D;
class Protect extends D{
	void test() {
		System.out.println(b);
	}
}
public class ProtectedDemo {

	public static void main(String[] args) {
		System.out.println("Default access modifier operation done");
        Protect p = new Protect();
        p.test();
	}

}
