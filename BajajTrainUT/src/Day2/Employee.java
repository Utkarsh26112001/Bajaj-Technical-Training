package Day2;

public class Employee {
	private int eid; //if we set By setting private we are restricting its access from outside the class;
	private String name;
	private double salary;
	private Department department;
	public static int count;
	
	
	
	//Constructors
	public Employee() {
		System.out.println("Non-Paramaterised Constructor");
	}
	public Employee(int eid, String name, double salary)
	{
		System.out.println("Paramaterised Constructor");
		this.eid=eid;
		this.name= name;
		this.salary= salary;
	}
	public Employee(Department department)
	{
		this.department=department;
	}
	//METHODS
	public void setData(int eid, String name, double salary)
	{
		this.eid=eid;
		this.name= name;
		this.salary= salary;// this means current object or alternative name;
		
	}
	public void display()
	{
		System.out.println("Employee id is::"+ eid +" "+ "Employee name is::"+ name+ " "+ "Salary is::" +salary );
	}
	// SETTERS AND GETTERS
	
		public void seteId(int eId) {
			this.eid = eId;
		}
		public int geteId() {
			return eid;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getSalary() {
			return salary;
		}
		//String Representation oF the object;;
		public String toString() {
			return " \nFrom to String:: " +eid +" "+name+" "+salary;
		}

}
