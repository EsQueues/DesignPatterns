package CarWashService;

public class Polirovka extends WashDecorator{
    @Override
    public int getPrice() {
        return super.getPrice()+800;
    }

    public Polirovka(Washer service) {
        super(service);
    }
}
