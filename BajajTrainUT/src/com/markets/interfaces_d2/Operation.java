package com.markets.interfaces_d2;

public interface Operation {
	void addition(int num1, int num2);
	//default can be override but static cent be overridden.
	default int division(int num1,int num2) {
		return num1 +num2+10;
		
	}
	static int multiplication(int num1, int num2) {
		return num1+num2;
		
	}
	
}
