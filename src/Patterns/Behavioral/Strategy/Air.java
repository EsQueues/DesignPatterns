package Patterns.Behavioral.Strategy;

public class Air implements Transport {

    @Override
    public void type() {
        System.out.println("This type of the transport flies in sky");
    }
}
