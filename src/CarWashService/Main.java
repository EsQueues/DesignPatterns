package CarWashService;

public class Main {
    public static void main(String[] args) {


        Washer wash=new TrunkWash(new SalonWash(new BaseWash()));
        System.out.println(wash.getPrice());



    }
}
