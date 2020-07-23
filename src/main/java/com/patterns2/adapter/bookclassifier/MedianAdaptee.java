package com.patterns2.adapter.bookclassifier;

import com.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
