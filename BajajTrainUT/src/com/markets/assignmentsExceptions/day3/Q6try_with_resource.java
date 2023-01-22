package com.markets.assignmentsExceptions.day3;
import java.io.FileOutputStream;

public class Q6try_with_resource {
	public static void main(String[] args) {
		try(FileOutputStream f= new FileOutputStream("q6.txt")){
			String text="Hello I am Utkarsh Tiwari, a java developer";
			byte a[] = text.getBytes();
			f.write(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Resources Are Close and message has been written in the text........");
	}

}
