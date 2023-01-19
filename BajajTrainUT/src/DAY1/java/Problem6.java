//Write a program to check number is Palindrome or not;
package DAY1.java;
import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number to be Checked(Integer)::");
		int A=s.nextInt();
		s.close();
		int sum=0,r,ck;
		ck=A;
		while(A>0)
		{
			r=A%10;
			sum=(sum*10)+r;
			A=A/10;
		}
		if(ck==sum)
		{
			System.out.println(ck + " is a Palindrome");
		}
		else
		{
			System.out.println(ck + " is not a Palindrome");
			
		}
		
		
	}

}

