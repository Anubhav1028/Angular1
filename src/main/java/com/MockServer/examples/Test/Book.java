package com.MockServer.examples.Test;

public class Book {

	
	private int bookId;
	
	private String bookName;
	
	private String bookDesc;

	public int getBookId() {
		return bookId;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String bookDesc) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
}
