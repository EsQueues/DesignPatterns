package Patterns.Structural.Decarator;

public class Polirovka extends WashDecorator{

    @Override
    public String action() {
        return super.action()+"extended to polirovka to color";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+800;
    }

    public Polirovka(Washer service) {
        super(service);
    }
}
