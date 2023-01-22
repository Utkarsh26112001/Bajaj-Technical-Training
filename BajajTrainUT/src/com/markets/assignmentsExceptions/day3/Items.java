package com.markets.assignmentsExceptions.day3;
import java.util.Objects;

public class Items {
	private int itemId;
	private String name;
	private double price;
	
	public Items() {
		
	}
	public Items(int itemId, String name, double price) {
		this.itemId= itemId;
		this.name= name;
		this.price= price;
		}
	public int getItemId() {
		return itemId;
	}
	public int setItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String toString() {
		return "Item [StockId=" + itemId + ", StockName=" + name +", StockPrice=" + price +"]";
	}
	public int hashCode() {
		return Objects.hashCode(itemId);
	}
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if(obj == null)
			return false;
		if (getClass()!= obj.getClass())
		return false;
		Items other=(Items) obj;
		return itemId== other.itemId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price)== Double.doubleToLongBits(other.price);
			
	}
}
