package com.crud.assertions;

import com.crud.exception.BookNotFoundException;
import com.crud.model.BookModel;
import com.crud.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowMethodException {

    @Test
    public void assert_Throw_Method_Without_Message() {
        BookService service = new BookService();

        BookModel model1 = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookModel model2 = new BookModel("102", "Data Structure", "Tata McGrawHill");

        service.addBookInList(model1);
        service.addBookInList(model2);

        assertThrows(BookNotFoundException.class, () -> {
            service.getSingleBookByTtile("Core Data");
        });
    }

    @Test
    public void assert_Throw_Method_With_Message() {
        BookService service = new BookService();

        BookModel model1 = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookModel model2 = new BookModel("102", "Data Structure", "Tata McGrawHill");

        service.addBookInList(model1);
        service.addBookInList(model2);

        assertThrows(BookNotFoundException.class, // RunTimeException.class can also work
                () -> service.getSingleBookByTtile("Core Data"),
                "Book Found in Store");
    }

    @Test
    public void assert_Throw_Method_With_Supplier_Message() {
        BookService service = new BookService();

        BookModel model1 = new BookModel("101", "Core Java", "Tata McGrawHill");
        BookModel model2 = new BookModel("102", "Data Structure", "Tata McGrawHill");

        service.addBookInList(model1);
        service.addBookInList(model2);

        assertThrows(BookNotFoundException.class, // RunTimeException.class can also work
                () -> service.getSingleBookByTtile("Core Data"),
                () -> "Book Found in Store");
    }


}
