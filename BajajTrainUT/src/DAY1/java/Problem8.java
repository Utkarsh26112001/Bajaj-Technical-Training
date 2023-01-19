package DAY1.java;
import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the Number::");
		Double A=s.nextDouble();
		s.close();
		System.out.println("The cube of the Number is::"+ cube(A));
	}
	public static double cube(double B)
	{
		double cb=B*B*B;
		return cb;	
	}
}

