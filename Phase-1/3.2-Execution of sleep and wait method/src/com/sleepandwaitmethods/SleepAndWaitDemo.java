package com.sleepandwaitmethods;
class Account {
	int amount = 10000;

	synchronized void withdraw(int amount) throws InterruptedException{

		if (this.amount < amount) {
			System.out.println("Less balance, waiting for someone to deposit...");
			this.wait();
		}

		this.amount -= amount;
		System.out.println("Withdraw operation successfully completed.");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to Deposit...");
		this.amount += amount;
		System.out.println("Deposit operation successfully completed. Notifying waiting threads");
		this.notify();
	}
}
public class SleepAndWaitDemo {
	public static void main(String[] args) {
		Account acct = new Account();

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					acct.withdraw(200000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
					acct.deposit(20000);
			}
		}).start();
}
}
