package Patterns.Creational.Factory.Subscription;

import Patterns.Creational.Factory.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VipSub implements Subscription {
    private final int maxPossibleRents=5;
    List<Book>bookList;
    public VipSub(){
        bookList=new ArrayList<>();
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

    @Override
    public void getType() {
        System.out.println("Your current sub is vip");
    }
}
