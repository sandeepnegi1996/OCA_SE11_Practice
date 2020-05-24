package com.sandy.ExceptionHandling;

// TODO 
// Ques. What can be the output of the following program




public class RethrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			print("1.0");
		} catch(Exception e) {
			System.out.println("C");
		}
		
	}
	
	public static void print(String s) {
		
		try {
			
			System.out.println(Integer.parseInt(s));
		} catch( NumberFormatException e) {
			
			System.out.println("A");
			throw new RuntimeException();		
		}
		finally
		{
			System.out.println("B");
		}
	}

}
