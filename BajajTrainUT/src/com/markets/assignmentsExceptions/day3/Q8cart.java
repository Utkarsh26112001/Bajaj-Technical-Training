package com.markets.assignmentsExceptions.day3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8cart {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		List<Items> itemsList= new ArrayList<Items>();
		System.out.println("Want to enter a item to record::");
		System.out.println("Enter Choice(Y/N)::");
		String choice= sc.next();
		
		while(!choice.equalsIgnoreCase("n")) {
			itemsList.add(getInputFromUser());
			System.out.println("Want to enter a item to record::");
			System.out.println("Enter Choice(Y/N)::");
		    choice= sc.next();
		}
		try {
			checkCart(itemsList);
		}catch(CartEmptyException e) {
			System.out.println(e);
		}
	}
	private static void checkCart(List<Items> itemsList) throws CartEmptyException{
		if(itemsList.isEmpty()) {
			throw new CartEmptyException("Your cart is empty...Add items!!!!!");
		}
		else {
			for(Items item: itemsList) {
				System.out.println(item);
			}
		}

	}
	private static Items getInputFromUser() {
		System.out.print("Enter the stock id::");
		int itemId= sc.nextInt();
		System.out.print("Enter the stock name::");
		String itemName= sc.next();
		System.out.print("Enter the stock price::");
		double itemPrice= sc.nextDouble();
		return new Items(itemId, itemName, itemPrice);
		
		}
	
}