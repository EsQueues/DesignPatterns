package Patterns.Behavioral.Strategy;

public class Waterway implements Transport {

    @Override
    public void type() {
        System.out.println("This type of transport is boat");
    }
}
