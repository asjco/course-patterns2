package com.patterns2.adapter.bookclassifier;

import com.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();

        Set<BookA> books = new HashSet<>();

        books.add(new BookA("author1", "title1", 1800, "sign1"));
        books.add(new BookA("author2", "title2", 1920, "sign2"));
        books.add(new BookA("author3", "title3", 1830, "sign3"));
        books.add(new BookA("author4", "title4", 1940, "sign4"));
        books.add(new BookA("author5", "title5", 1990, "sign5"));
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        System.out.println("median is: " + median);
        Assert.assertEquals(1920, median);
    }
}
