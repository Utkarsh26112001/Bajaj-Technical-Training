package com.markets.assignmentsExceptions.day3;
import java.io.*;
import java.nio.file.Paths;


public class Q4Merge {
	public static String MY_PATH = Paths.get("").toAbsolutePath().toString() + "/src/com/markets/assignment/day3/";

	public static void main(String[] args) {

		try {
			PrintWriter printWriter = new PrintWriter(MY_PATH + "/text3.txt");
			BufferedReader bufferedReader1 = new BufferedReader(new FileReader(MY_PATH + "/text1.txt"));
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader(MY_PATH + "/text2.txt"));

			int char1 = bufferedReader1.read();
			int char2 = bufferedReader2.read();

			
			while (char1 != -1 || char2 != -1) {
				if (char1 != -1) {
					printWriter.print((char) char1);
					char1 = bufferedReader1.read();
				}
				if (char2 != -1) {
					printWriter.print((char) char2);
					char2 = bufferedReader2.read();
				}

			}
			printWriter.flush();
			bufferedReader1.close();
			bufferedReader2.close();
			printWriter.close();
		} /*catch (FileNotFoundException e) {
				e.printStackTrace();
		}*/ catch (IOException e) {
				e.printStackTrace();
		}

		System.out.println("Merged text1.txt and text2.txt characters alternatively into text3.txt");
	}
}
