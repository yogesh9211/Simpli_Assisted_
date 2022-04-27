package com.synchrozation;
class Table {
	
	  void printTable(int n) throws InterruptedException{
		  
		  synchronized(this) {
			  System.out.println("Printing table of "+n);
				for(int i=1; i<=10; i++) {
					Thread.sleep(10);
					System.out.println(n*i);
				} 
		  }
		 
			
	}
}
class MyRunnable1 implements Runnable {
	Table table;
	public MyRunnable1(Table t) {
		this.table = t;
	}
	@Override
	public void run() {
		try {
			table.printTable(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyRunnable2 implements Runnable {
	Table table;
	public MyRunnable2(Table t) {
		this.table = t;
	}
	@Override
	public void run() {
		try {
			table.printTable(9);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SynchronizationDemo {
public static void main(String[] args) throws InterruptedException {
		
		Table table = new Table();
		Thread t1 = new Thread(new MyRunnable1(table));
		Thread t2 = new Thread(new MyRunnable2(table));
		
		t1.start();
		t2.start();
}
}
