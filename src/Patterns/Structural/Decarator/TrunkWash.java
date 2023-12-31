package Patterns.Structural.Decarator;

public class TrunkWash  extends WashDecorator{
    public TrunkWash(Washer service) {
        super(service);
    }

    @Override
    public String action() {
        return super.action()+"+Washing trunk of this car";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1500;
    }
}
