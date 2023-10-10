package CarWashService;

public class WashDecorator implements Washer {
    Washer washer;

    public WashDecorator(Washer service) {
        this.washer = service;
    }

    @Override
    public int getPrice() {
        return washer.getPrice();
    }


}
