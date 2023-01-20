package com.markets.assignments.day1;

public class test_employee {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setData(101, "Utkarsh ", 67000.89);
		emp1.display();
		Employee emp2=new Employee();
		emp2.setData(102, "Devesh", 75000);
		emp2.display();
		
		
		emp2.eid =103;
		emp2.name="Sudrshan";
		emp2.display();
		
		
		Employee emp3=new Employee(104,"Abhi",50000);
		emp3.display();
		
		System.out.println(emp1);	
	}

}
