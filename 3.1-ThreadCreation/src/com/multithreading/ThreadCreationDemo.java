package com.multithreading;
class MultiThread1 extends Thread {

	public void run() {
		System.out.println("Thread is running...");
	}
}
public class ThreadCreationDemo {
public static void main(String[] args) {
		
		MultiThread1 thread = new MultiThread1();
		thread.start();	
	}
}
