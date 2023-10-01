package Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Air air=new Air();
        Automobile automobile=new Automobile();
        Railway railway=new Railway();
        Waterway waterway=new Waterway();
        License license1=new License("Sayat",18,0,automobile);
        License license2=new License("Andrei",67,50,air);
        License license3=new License("Poezdist",48,20,railway);
        License license4=new License("Capitan",91,67,waterway);
        license4.getTypeOfTransport();
    }
}
