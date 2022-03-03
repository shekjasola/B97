package com.cts.exceptions;

public class ExceptionEx {
	
	public void divide (int a, int b) {
		int quotient=0;
		try {
			quotient=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occoured"+ e.getMessage());
			//System.exit(00);
		}
		finally
		{
			System.out.println("The quotient is: "+quotient);
		}
	}

	public static void main(String[] args) {
		ExceptionEx e1= new ExceptionEx();
		e1.divide(10, 0);

	}

}
