/*
 * 	2.	After mentioning to Professor Jackson that you would like to get some more practice with exceptions, she offered to let you write some grading software! Before she gives you full control over auto-grading students’ work, she asked if you could write a function called checkFileExtension(). 

	The checkFileExtension() method takes in one parameter: fileName.

	checkFileExtension() should return an integer representing the number of points a student receives for properly submitting a file in Java. 

	If a student’s submitted file ends in .java, they get 1 point. 

	If a student’s submitted file doesn’t end in .java, they get 0 points. 

	If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points. 

	What kind of exception is up to you, including to a custom exception!

	In main(), Professor Jackson has provided a array of students and the names of their submitted files for you to test out your work. 

	If an exception is caught, make sure to print out the error message.

 * 
 */

package com.Exception.bll;

public class CheckFileExtension {

	public static void main(String[] args) {
	    
		String[] names = {"Ajay ", "Vijay", "Ram","Sanjay"};
		String[] files = {"Circle.java","",null,"Notes.txt"};
		
			int i=0;
		
		//using for loop for string values
			for(String file:files) {  
			System.out.println(i);
				
			try {
						 
				int r = checkFileExtension(file);
			//condition check
				if(r==1)
					System.out.println("Hello " + names[i] +". Your " + file + " is a java file. And your score is 1");
				else
					System.out.println("Hello " + names[i] +". Your " + file + " is not a java file. And your score is 0");
				 
			}	
				
	//null string	
		catch(NullFileException ex) {
			System.out.println("Hello " + names[i] +".\n Your have send a null. Your score is -1");
			System.out.println(ex.getMessage());
		}
	//empty string
		catch(EmptyFileException ex) {
			System.out.println("Hello " + names[i] +".\n Your have send an empty string. Your score is -1");
			System.out.println(ex.getMessage());
		}
	//other exception
		catch(Exception ex) {
			System.out.println("Your score is -1");
			System.out.println(ex.getMessage());
		}
				i++;	
			}    
}
	public static int checkFileExtension(String fileName) throws NullFileException, EmptyFileException {
			
			if(fileName == null)
				throw new NullFileException("You have send the null string.");
			
			
			if(fileName.isEmpty())
				throw new EmptyFileException("You have send the empty string.");
			
			if(fileName.endsWith(".java"))
				return 1;
			else 
				return 0;
	}

}