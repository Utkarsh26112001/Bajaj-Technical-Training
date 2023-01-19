//Find whether the no is positive or negative; 
package DAY1.java;
import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked::");
		int A= sc.nextInt();
		sc.close();
		if(A<0)
		{
			System.out.println(A+" is a Negative Number.");
		}
		else if(A==0)
		{
			System.out.println(A+" is a neither Positive nor Negative Number.");
		}
		else
		{
			System.out.println(A+" is a Positive Number.");
		}
		
	}

}
