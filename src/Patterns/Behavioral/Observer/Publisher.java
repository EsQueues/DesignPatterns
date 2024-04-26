package Patterns.Behavioral.Observer;

import java.util.HashMap;
import java.util.List;

public class Publisher {
    private String name;
    List<Subscriber> subscriberList;
    HashMap<String,List<Book>> listOfBooks;


    public Publisher(String name){
        listOfBooks.put(name,)
    }

    public void addSubscriber(Subscriber sub){
        subscriberList.add(sub);
    }
    public void removeSubscriber(Subscriber sub){
        subscriberList.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber sub:subscriberList){
            sub.update();
        }
    }

}
