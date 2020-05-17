package com.crud.example;

import com.crud.model.BookModel;
import com.crud.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class AssertFalseMethod {

    /* Actual Value= False , Test Case will Pass
     * Actual Value= True , Test Case will Fail
     * */

    @Test
    public void assert_False_Method_with_boolean_condition() {
        BookModel model = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookService service = new BookService();
        service.addBookInList(model);
        assertFalse(() -> service.getListOfBook().isEmpty());
    }

    @Test
    public void assert_False_Method_with_boolean_condition_and_message() {
        BookModel model = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookService service = new BookService();
        service.addBookInList(model);
        System.out.println(service.getListOfBook().isEmpty());
        assertFalse(service.getListOfBook().isEmpty(), "List is not Empty"); //Message should be written on when test cases gets failed
    }

}
