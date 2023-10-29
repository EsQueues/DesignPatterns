package Patterns.Creational.Factory.Subscription;

import Patterns.Creational.Factory.Book;

public interface Subscription {
    void getType();
    boolean rentBook(Book book);
    int getMaxPossibleRent();

}
