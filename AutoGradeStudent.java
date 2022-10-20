package com.Exception.bll;

public class AutoGradeStudent {
//fields
	private int x;
	private int y;
		
		//divide function
			public double divide(int x, int y) {
				try{
					this.x=x;
				 	this.y=y;
				 	double result;
				 	result=(double)x/y;
					return result;
				}
				
			//arithmetic exception class to handle mathematical errors 
				catch(ArithmeticException ex){
					System.out.println(" Divisor must not be 0");
				}
				return y;   
	}
}
