package com.sandy.ExceptionHandling;

// TODO Ques: Find the Output of the below problem
// TODO BlogEnry: OCA prepration guide
public class finalExceptionVariable {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2};
		
		try {
			
			arr[2]=3;
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException  e) {
			
			if(e instanceof ArrayIndexOutOfBoundsException )
			{
			//	e=new ArrayIndexOutOfBoundsException("Out of Bounds ");
				
				System.out.println("inside if above line will thrown error since  'e'  is final and cannot be reassigned");
			}
		
			
			System.out.println(e.getClass().getSimpleName());
		}

	}

}
