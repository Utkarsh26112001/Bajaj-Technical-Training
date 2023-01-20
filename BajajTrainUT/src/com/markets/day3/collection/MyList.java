package com.markets.day3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	public static void main(String[] args){
		MyList.myArrayList();
	}
	public static void myArrayList() {
		//List list= new ArrayList();
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Jaam");
		//list.add("10");
		System.out.println(list);	
		System.out.println("Simple For");
		for(int i=0;i<list.size();i++)
		{
			String name= list.get(i);
			System.out.println(name);
		}
		System.out.println("Using Advance For");
		for(String name:list)
		{
			System.out.println(name);
		}
		/*System.out.println("Using Iterator");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			system.
		}*/
	}
}

