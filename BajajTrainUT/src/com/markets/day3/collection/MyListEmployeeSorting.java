package com.markets.day3.collection;
import java.util.ArrayList;
import java.util.List;

import com.markets.day2.Employee;

public class MyListEmployeeSorting {
	public static void main(String[] args) {
		myListSorting();
	}
	public static void myListSorting() {
		Employee emp1= new Employee(101,"Asha",60);
		Employee emp2= new Employee(103,"Nisha",90);
		Employee emp3= new Employee(102,"Disha",80);
		Employee emp4= new Employee(102,"Disha",80);
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		
	}
		

}
