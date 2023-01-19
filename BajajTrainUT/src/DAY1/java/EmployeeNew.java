package DAY1.java;
import java.util.Scanner;

public class EmployeeNew {
		int eid;
		String name;
		double salary;
		
	public EmployeeNew(int eid, String name, double salary) {
		this.eid=eid;
		this.name= name;
		this.salary= salary;		
	}
	public void display()
		{
			System.out.println("\nEmployee id is::"+ eid +" "+ "Employee name is::"+ name+ " "+ "Salary is::" +salary );
		}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of records to be Entered::");
		int n=s.nextInt();
		int count=0;
	
		EmployeeNew[] ne =new EmployeeNew[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Employee id::");
			int eid=s.nextInt();
			System.out.println("Enter the Employee_Name::");
			String name=s.next();
			System.out.println("Enter the employee Salary::");
			double salary=s.nextDouble();
			ne[i]=new EmployeeNew(eid,name,salary);
			count++;
		}
		s.close();
		for(int i=0;i<n;i++)
		{
			if(ne[i].salary>50000)
			{
			ne[i].display();
		}
		}
		System.out.println("\nTotal number of Employees are::"+ count);
	}
}

