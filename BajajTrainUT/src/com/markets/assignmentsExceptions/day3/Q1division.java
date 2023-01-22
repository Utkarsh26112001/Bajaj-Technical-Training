package com.markets.assignmentsExceptions.day3;

public class Q1division {
	
		public void Division(int num1, int num2)
		{
			try { if(num2>0) {
			System.out.println("Division Begins...");
			int div=num1/num2;
			System.out.println("Division= " +div);
			} 
			else
			{
				throw new DivideByZeroException("Pls check the denomminator");
			}
			}
			catch(DivideByZeroException e)
			{
				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("" +e);
			}
			finally {
				System.out.println("Inside Finally Block...");
			}
			
		}
}



