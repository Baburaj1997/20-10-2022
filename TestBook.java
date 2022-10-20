/*	 3.	Do the following:

	Create a class Book with id, name as the member variables.

	Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.

	Create a test class with an array of 5 books with ids starting from 1.

	Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.

	Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".

	Handle the exception in main method and print the stacktrace in catch block.

 */



package com.Exception.bll;

public class TestBook {
	public static void main (String []args) {
		
		//Creating array of Book to store book names.
			Book[] arr = new Book[5];
		
				arr[0] = new Book(101, "java");
				arr[1] = new Book(102, "c");
				arr[2] = new Book(103, "c++");
				arr[3] = new Book(104, "python");
				arr[4] = new Book(105, "ruby");
			
				
				try {
				//Calling method findById
					boolean isFound = findById(arr, 10);  
					if(isFound)
						System.out.println("Found");
				}
				catch(BookNotFoundException ex) {
					
					//System.out.println(ex.getMessage());
					ex.printStackTrace();
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
		}
		
		// Method to check the id with available id in the book array.
			public static boolean findById(Book[] books, int id) throws BookNotFoundException {
				
				for(int i = 0; i< books.length; i++) {
					
					if(books[i].getId() == id) 
						
						return true;
					
					else 
						throw new BookNotFoundException("Book not found.");
					
				}
				return false;
				
			}
			
}
