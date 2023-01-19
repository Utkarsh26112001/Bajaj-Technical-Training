package Day2;

public class TestCustomerAccount {
	public static void main(String[] args)
	{
		Customer c1=new Customer();
		c1.setcId(101);
		c1.setName("Devesh");
		Account acc =c1.getAccount();
		acc.setAnumber(2301);
		acc.setBalance(10000);
		System.out.println("Customer ID::" +c1.getcId());
		System.out.println("Customer Name::" +c1.getName());
		System.out.println("Account Number::" +acc.getAnumber());
		System.out.println("Account Balance::" + acc.getBalance());
		
		
	}

}
