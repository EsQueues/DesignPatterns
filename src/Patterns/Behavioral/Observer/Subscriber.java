package Patterns.Behavioral.Observer;

import java.util.List;

public interface Subscriber {
    void handleEvent(List<Book> bookList);
}
