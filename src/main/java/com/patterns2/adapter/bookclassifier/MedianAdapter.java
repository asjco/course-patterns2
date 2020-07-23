package com.patterns2.adapter.bookclassifier;

import com.patterns2.adapter.bookclassifier.librarya.BookA;
import com.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> books = new HashMap<>();
        for (BookA bookA : bookASet) {
            books.put(new BookSignature(bookA.getSignature()),
                    new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
