package Patterns.Creational.Factory.Librarian;

import Patterns.Creational.Factory.Book;
import Patterns.Creational.Factory.Subscription.Subscription;

import java.util.ArrayList;
import java.util.List;

public abstract class Librarian {
    Subscription subscription = getSubscription();
    public void getTypeOfSub(){
        subscription.getType();
    }
    public void getMaxPossibleRents(){
        System.out.println(subscription.getMaxPossibleRent());
    }
    public boolean rentBook(Book book){
        return subscription.rentBook(book);
    }

    public abstract Subscription getSubscription();
}
