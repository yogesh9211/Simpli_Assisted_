package com.collection;
import java.util.TreeSet;
public class TreeDemo {
	//Tree set demo
	public static void main(String[] args) {

		TreeSet<String> data = new TreeSet<>();
		data.add("Zalak");
		data.add("Amit");
		data.add("Sumit");
		data.add("Sapriya");

		for (String d : data) {
			System.out.println(d);
		}
}
}