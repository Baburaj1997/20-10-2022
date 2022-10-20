package com.Exception.bll;

public class Book {
  
  //fields
	public int id;
	public String name;
	
  //default constructor
	public Book() {
		super();	
	}

  //Parameterized constructor
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

  //getters and setters.
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

}
