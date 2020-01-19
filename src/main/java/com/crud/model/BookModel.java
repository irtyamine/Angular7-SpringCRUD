package com.crud.model;

public class BookModel {
	
	private String bookId;
	private String title;
	private String publisher;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "BookModel [bookId=" + bookId + ", title=" + title + ", publisher=" + publisher + "]";
	}
	public BookModel(String bookId, String title, String publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
	}
	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
