package com.markets.day3.collection;
import java.util.HashSet;
import java.util.Set;

import com.markets.day2.Employee;

public class MySetEmployee {
	public static void main(String[] args) {
		MySetEmployee.myEmployeeSet();;
		
	}
	public static void myEmployeeSet() {
		Employee emp1= new Employee(101,"Asha",60);
		Employee emp2= new Employee(103,"Nisha",90);
		Employee emp3= new Employee(102,"Disha",80);
		Employee emp4= new Employee(102,"Disha",80);
		
		
		Set<Employee> set = new HashSet<>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
		System.out.println(set);
		}

}
