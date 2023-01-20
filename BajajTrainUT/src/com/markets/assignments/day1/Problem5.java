//Check if the no is prime or not.
package com.markets.assignments.day1;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args)
	{
		Problem5 prob5= new Problem5();
		prob5.prime();
	}
		void prime(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to be checked(integer)::");
		int A= sc.nextInt();
		sc.close();
		int flag=0, m=A/2;
		if(A==1 || A==0)
		{
			System.out.println(A+" is neither prime nor composite");
		}
		else 
		{
			for(int i=2;i<=m;i++)
			{
				if(A%i==0)
				{
					System.out.println(A+" is a Composite number.");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(A+" is a Prime number.");
				
			}
			
		}
		
	}
}
