package com.markets.day3.collection;
import java.util.Set;
import java.util.HashSet;

public class MySet {
	public static void main(String[] args) {
		
		MySet.myHashSet();
	}
	public static void myHashSet() {
			Set<String> set = new HashSet<String>();
			set.add("Ram");
			set.add("Sham");
			set.add("Jam");
			System.out.println(set);
			
		
	}
}
