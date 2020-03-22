package com.crud.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.crud.model.BookModel;

public class BookService {
	
	List<BookModel> listOfBook = new ArrayList<>();
	
	public List<BookModel> getListOfBook() {
		return listOfBook;
	}


	public void addBookInList(BookModel model) {
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
			if(publisher.equalsIgnoreCase(book.getPublisher())){
				actualList.add(book.getTitle());
			}
			
		}
		return actualList;
	}
	
	public List<BookModel> getBookByTitle(String title) {
		
		return listOfBook.stream().filter(bookObject -> bookObject.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
	}
	

}
