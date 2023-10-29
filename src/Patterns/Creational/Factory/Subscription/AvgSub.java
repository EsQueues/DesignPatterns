package Patterns.Creational.Factory.Subscription;

import Patterns.Creational.Factory.Book;

import java.util.ArrayList;
import java.util.List;

public class AvgSub implements Subscription {
    private final int maxPossibleRents=2;
    List<Book>bookList;
    public AvgSub(){
        bookList=new ArrayList<>();
    }

    @Override
    public void getType() {
        System.out.println("Your current sub is average");
    }

    @Override
    public boolean rentBook(Book book) {
        if(bookList.size()<maxPossibleRents){
            bookList.add(book);
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public int getMaxPossibleRent() {
        return maxPossibleRents;
    }
}
