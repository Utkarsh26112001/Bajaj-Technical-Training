package com.markets.day3.collection;
import java.util.*;

import com.markets.day2.Employee;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myHashMap();
		myHashMapWithEmployee();
	}
	public static void myHashMap() {
		//Map<Integer, String> map= new HashMap<Integer, String>();
		//Map<Integer, String> map= new LinkedHashMap<Integer, String>();
		Map<Integer, String> map= new TreeMap<Integer, String>();
		map.put(101, "Pune");
		map.put(102 ,"Chennai");
		map.put(103, "Mumbai");
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
	public static void myHashMapWithEmployee() {
		Employee emp1= new Employee(101,"Asha",60);
		Employee emp2= new Employee(103,"Nisha",90);
		Employee emp3= new Employee(102,"Disha",80);
		Employee emp4= new Employee(102,"Disha",80);
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(emp1,"Pune");
		map.put(emp2,"Chennai");
		map.put(emp3,"Delhi");
		map.put(emp4,"Hyderabad");
		
		System.out.println(map);
	}

}
