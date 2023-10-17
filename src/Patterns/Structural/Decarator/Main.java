package Patterns.Structural.Decarator;

public class Main {
    public static void main(String[] args) {
        Washer wash=new TrunkWash(new SalonWash(new BaseWash()));
        System.out.println(wash.action());
        System.out.println("for the price:"+wash.getPrice());
    }
}
