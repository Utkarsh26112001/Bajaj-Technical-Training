package com.markets.assignmentsExceptions.day3;
import java.io.*;
public class FileNotFoundException {
	public static void main(String[] args)
	{
		try {
			
			
	        // Creating an instance of FileReader class
	        FileReader fileReader = new FileReader("/Users/utkarshtiwari/Downloads/Assignment.txt");
	    
	        System.out.println(fileReader.read());
	        fileReader.close();
	        
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
		finally {
			System.out.println("I am in the finally..");
		}
		
	}
	
}
