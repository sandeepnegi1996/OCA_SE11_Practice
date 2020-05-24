package com.sandy.ExceptionHandling;

public class NotCatched_Exception {

	static Integer i=0;
	public static void main(String[] args) {
		try {
		int x=10;
		System.out.println(x%i.intValue());
		}
		catch(NullPointerException e) {
			System.out.println(e.getClass().getSimpleName());
		}
		finally {
			System.out.println("A");
		}
		
		
	}

}
