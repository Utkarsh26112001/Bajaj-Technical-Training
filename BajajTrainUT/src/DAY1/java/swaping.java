package DAY1.java;
import java.util.Scanner;

public class swaping {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st No::");
		int A= sc.nextInt();
		System.out.println("Enter 1st No::");
		int B=sc.nextInt();
		sc.close();
		
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("First Number "+A+" Second Number "+B);
		
	}

}
