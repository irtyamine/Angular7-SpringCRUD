package com.crud.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crud.model.BookModel;
import com.crud.service.BookService;

class AssertNullMethod {

	/* Actual Value= NULL , Test Case will Pass
	 * Actual Value= NOT NULL , Test Case will Fail
	 * */
	
	@Test
	public void assert_null_Method_with_Object_as_String() {
		String name="Johnson";
		String age=null;
//		assertNull(name);
		assertNull(age);
	}
	
	@Test
	public void assert_null_Method_with_Object_as_class_object() {
		BookModel model1 = new BookModel("101","Core Java","Tata McGrawHill");
		BookModel model2 = new BookModel(null,"Advance Java","Tata McGrawHill");
		BookService service = new BookService();
		service.addBookInList(model1);
		service.addBookInList(model2);
		assertNull(service.getListOfBook().get(1).getBookId());
	}

}
