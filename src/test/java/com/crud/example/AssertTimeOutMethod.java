package com.crud.example;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.crud.model.BookModel;
import com.crud.service.BookService;
class AssertTimeOutMethod {

	@Test
	void assert_timeout_without_messages() {
		
		BookService service = new BookService();
		
		
		for(int i=1;i<100000;i++) {
			service.addBookInList(new BookModel(String.valueOf(i),"Core Java","TechMax" ));
		}
		List<String> actualTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1),()-> actualTitles.addAll(service.getBookTitlesByPublisher("TechMax")));
		
	}

}
