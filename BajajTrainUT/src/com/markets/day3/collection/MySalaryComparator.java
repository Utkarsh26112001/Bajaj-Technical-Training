package com.markets.day3.collection;
import java.util.Comparator;
import com.markets.day2.Employee;
 
public class MySalaryComparator implements Comparator<Employee>{

	public int compare(Employee emp1, Employee emp2) {
		if(emp1.salary > emp2.salary) {
			return 1;
		}else if(emp1.salary< emp2.salary) {
			return -1;
		}else {
			return 0;
		}
	}
}
