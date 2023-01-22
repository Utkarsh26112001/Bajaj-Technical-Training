package com.markets.assignmentsExceptions.day3;

public class CartEmptyException extends Exception{
	private static final long serialVersionUID = -7116985071862669593L;

	public CartEmptyException(String message) {
		super(message);
	}

}
