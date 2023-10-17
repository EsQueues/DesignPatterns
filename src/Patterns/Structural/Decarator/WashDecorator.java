package Patterns.Structural.Decarator;

public abstract class WashDecorator implements Washer {
    Washer washer;

    public WashDecorator(Washer service) {
        this.washer = service;
    }


    @Override
    public int getPrice() {
        return washer.getPrice();
    }

    @Override
    public String action() {
        return washer.action();
    }


}
