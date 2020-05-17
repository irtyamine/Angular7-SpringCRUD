package com.crud.service;

import com.crud.exception.BookNotFoundException;
import com.crud.model.BookModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

	private List<BookModel> listOfBook;
	
	public List<BookModel> getListOfBook() {
		return listOfBook;
	}

	public void addBookInList(BookModel model) {
		if(listOfBook == null)
			this.listOfBook = new ArrayList<>();
		listOfBook.add(model);
	}

	public List<BookModel> Book() {
		return Collections.unmodifiableList(listOfBook);
	}

	public BookModel getBookModel() {
		return new BookModel();
	}

	public List<String> getBookTitlesByPublisher(String publisher){
		List<String> actualList = new ArrayList<>();
		for(BookModel book:listOfBook) {
			if (publisher.equalsIgnoreCase(book.getPublisher())) {
				actualList.add(book.getTitle());
			}
		}
		return actualList;
	}

	public List<BookModel> getBookByTitle(String title) {
		return listOfBook.stream().filter(bookObject -> bookObject.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
	}

	public BookModel getSingleBookByTtile(String title) {
		for (BookModel book : this.listOfBook) {
			if (title.equalsIgnoreCase(book.getTitle()))
				return book;
		}
		throw new BookNotFoundException("Book not found in Book Store");
	}

	public BookService() {
		super();
	}

	public BookService(List<BookModel> listOfBook) {
		this.listOfBook = listOfBook;
	}
}


