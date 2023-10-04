package Patterns.Strategy;

public class Machine {
    private String name;
    private Transport transport;
    private int price;
    private int year;

    public Machine(String name, Transport transport, int price, int year) {
        this.name = name;
        this.transport = transport;
        this.price = price;
        this.year = year;
    }
    public void getForAvgPriceeachTupeTransport(){
        transport.type();
    }
}
