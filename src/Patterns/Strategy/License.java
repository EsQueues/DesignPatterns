package Patterns.Strategy;

public class License {
    private String name;
    private int age;
    private int experience;
    private Transport transport;
    public License(String name, int age, int experience, Transport transport){
        this.name=name;
        this.age=age;
        this.experience=experience;
        this.transport=transport;
    }
    public void getTypeOfTransport(){
        transport.type();
    }
}
