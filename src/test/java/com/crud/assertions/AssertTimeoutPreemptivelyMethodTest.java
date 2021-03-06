package com.crud.assertions;

import com.crud.model.BookModel;
import com.crud.service.BookService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AssertTimeoutPreemptivelyMethodTest {

    @Test
    @Disabled("skipped until #95 issue has been fixed")
    void assert_timeout_preemptively_without_messages() {
        BookService service = new BookService();
        for (int i = 1; i <= 10000; i++) {
            service.addBookInList(new BookModel(String.valueOf(i), "Core Java", "TechMax"));
        }
        List<String> actualTitles = new ArrayList<>();
        assertTimeoutPreemptively(Duration.ofMillis(1), () -> {
            actualTitles.addAll(service.getBookTitlesByPublisher("TechMax"));
        });
        assertEquals(10000, actualTitles.size());
    }

    @Test
    @Disabled("skipped until #95 issue has been fixed")
    void assert_timeout_preemptively_with_messages() {
        BookService service = new BookService();
        for (int i = 1; i <= 10000; i++) {
            service.addBookInList(new BookModel(String.valueOf(i), "Core Java", "TechMax"));
        }
        List<String> actualTitles = new ArrayList<>();
        assertTimeoutPreemptively(Duration.ofMillis(1), () -> {
            actualTitles.addAll(service.getBookTitlesByPublisher("TechMax"));
        }, "Performance issues with getBookTitlesByPublisher() method !");
        assertEquals(10000, actualTitles.size());
    }

    @Test
    @Disabled("skipped until #95 issue has been fixed")
    void assert_timeout_preemptively_with_supplier_messages() {
        BookService service = new BookService();
        for (int i = 1; i <= 10000; i++) {
            service.addBookInList(new BookModel(String.valueOf(i), "Core Java", "TechMax"));
        }
        List<String> actualTitles = new ArrayList<>();
        assertTimeoutPreemptively(Duration.ofMillis(5), () -> {
            actualTitles.addAll(service.getBookTitlesByPublisher("TechMax"));
        }, () -> "Performance issues with getBookTitlesByPublisher() method !");
        assertEquals(10000, actualTitles.size());
    }
}
