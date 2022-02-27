package com.collection;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> data = new LinkedList<>();
		data.add("Rishu");
		data.add("Rishu");
		data.add("Rod");
		data.add("Sumit");
		System.out.println("Linkedlist operation implemented");
		for (String g : data) {
			System.out.println(g);
		}
}
}

