package com.markets.exceptions.d2;

public class TestVoter {
	public static void main(String[] args) {
		Voter voter=new Voter();
		voter.validateAge(10);
		System.out.println("Validation Done");
		voter.fun();
	}

}
