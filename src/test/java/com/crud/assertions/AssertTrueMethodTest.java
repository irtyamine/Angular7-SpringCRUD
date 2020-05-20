package com.crud.assertions;

import com.crud.model.BookModel;
import com.crud.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueMethodTest {


    @Test
    public void assert_True_Method_overloading_without_message() {

        BookModel model = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookService service = new BookService();
        service.addBookInList(model);
        assertTrue(service.getListOfBook().isEmpty());
    }

    @Test
    public void assert_True_Method_overloading_with_Message() {

        BookModel model = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookService service = new BookService();
        service.addBookInList(model);
        assertTrue(service.getListOfBook().isEmpty(), () -> "This Book List is not empty"); //Message should be written on when test cases gets failed
    }

    @Test
    public void assert_True_Method_overloading_with_boolean_supplier() {

        BookModel model = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookService service = new BookService();
        service.addBookInList(model);
        assertTrue(() -> service.getListOfBook().isEmpty()); //Message should be written on when test cases gets failed
    }

    @Test
    public void assert_True_Method_overloading_with_boolean_supplier_messgae_supplier() {

        BookModel model = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookService service = new BookService();
        service.addBookInList(model);
        assertTrue(() -> service.getListOfBook().isEmpty(), () -> "This Book List is not empty"); //Message should be written on when test cases gets failed
    }


}
