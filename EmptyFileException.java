package com.Exception.bll;


//creating user defined empty exception.

public class EmptyFileException extends Exception {

	public EmptyFileException() {
		super();
	}
	
	public EmptyFileException(String message) {
		super(message);
	}
	
}
