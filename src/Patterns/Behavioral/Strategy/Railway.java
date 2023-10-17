package Patterns.Behavioral.Strategy;

public class Railway implements Transport {
    @Override
    public void type() {
        System.out.println("This type of transport is poezd");
    }
}
