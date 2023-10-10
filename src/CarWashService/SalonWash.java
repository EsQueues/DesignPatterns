package CarWashService;

public class SalonWash extends WashDecorator{

    public SalonWash(Washer service) {
        super(service);
    }

    @Override
    public String action() {
        return super.action()+"+extended salon the car";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+3000;
    }


}
