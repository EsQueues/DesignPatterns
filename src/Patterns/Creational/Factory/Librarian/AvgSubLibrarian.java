package Patterns.Creational.Factory.Librarian;

import Patterns.Creational.Factory.Subscription.AvgSub;
import Patterns.Creational.Factory.Subscription.Subscription;

public class AvgSubLibrarian extends Librarian {
    @Override
    public Subscription getSubscription() {
        return new AvgSub();
    }
}
