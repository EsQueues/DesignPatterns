package Patterns.Behavioral.Strategy;

public class Automobile implements Transport {

    @Override
    public void type() {
        System.out.println("This type of the transport is automobile");
    }
}
