package Patterns.Creational.Factory.Librarian;

import Patterns.Creational.Factory.Subscription.Subscription;
import Patterns.Creational.Factory.Subscription.VipSub;

public class VipSubLibrarian extends Librarian {
    @Override
    public Subscription getSubscription() {
        return new VipSub();
    }
}
