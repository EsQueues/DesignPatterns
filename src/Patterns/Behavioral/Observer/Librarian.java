package Patterns.Behavioral.Observer;

import java.util.List;

public class Librarian implements Subscriber{
    private String name;
    public Librarian(String name){
        this.name=name;
    }
    @Override
    public void update(List<Book> bookList) {
        System.out.println("Hello "+this.name);
        System.out.println("In out ");
    }
}
