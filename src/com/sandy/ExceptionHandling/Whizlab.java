package com.sandy.ExceptionHandling;

// Ques: find the output of the below problem

public class Whizlab {
	
	static Integer i;

	public static void main(String[] args) {

		try {
			
			System.out.println(i.doubleValue());
			
		}catch( NullPointerException | RuntimeException e) {
			System.out.println(e.getClass().getSimpleName());
		}

	}

}

// TODO
// Output
// NullPointerException is already caight by RuntimeException hence this will throw compilation error

