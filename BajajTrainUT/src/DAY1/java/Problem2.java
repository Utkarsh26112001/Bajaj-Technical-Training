//Swap two numbers using third variable.
package DAY1.java;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args)
	{
		Problem2 prob2= new Problem2();
		prob2.swap();
		
	}
	public void swap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number::");
		int A= sc.nextInt();
		System.out.print("Enter the Second Number::");
		int B=sc.nextInt();
		sc.close();
		int X;
		X=A;
		A=B;
		B=X;
		System.out.println("The new first number is::"+A+" and new second number is::"+B);
	}

}
