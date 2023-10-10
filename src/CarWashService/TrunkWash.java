package CarWashService;

public class TrunkWash  extends WashDecorator{

    public TrunkWash(Washer service) {
        super(service);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1500;
    }
}
