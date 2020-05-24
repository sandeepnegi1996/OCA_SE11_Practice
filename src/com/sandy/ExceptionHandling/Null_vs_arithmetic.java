package com.sandy.ExceptionHandling;

public class Null_vs_arithmetic {

	static Integer i;
	public static void main(String[] args) {

		try {
			int x=10;
		    System.out.println(x/i.intValue());
			
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getClass().getSimpleName());
			
		}
	}

}
