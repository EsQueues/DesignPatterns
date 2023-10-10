package CarWashService;


public class BaseWash implements Washer{
    public int getPrice(){
        return 1000;
    }

    @Override
    public String action() {
        return "Washing out of the machine";
    }
}
