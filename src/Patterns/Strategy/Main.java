package Patterns.Strategy;

import java.util.ArrayList;
import java.util.List;

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

       Machine machine1=new Machine("Vertolet-S012",air,132031,1989);
       Machine machine2=new Machine("Plane-Z888",air,203121,1938);
       Machine machine3=new Machine("Talgo",railway,7803204,1989);
       Machine machine4=new Machine("Poezd",railway,232431,1329);
       Machine machine5=new Machine("Qayik-Z888",waterway,882031,2010);
       Machine machine6=new Machine("ADDD-Z888",waterway,8031,2010);
       Machine machine7=new Machine("Titanik-Z888",waterway,652031,2010);
       Machine machine8=new Machine("Kater-9",waterway,42031,2010);
       Machine machine9=new Machine("Audi-T-100",automobile,22031,2010);
       Machine machine10=new Machine("BMW-S-class",automobile,2882031,2010);
       List<Machine> list=new ArrayList<>();
       list.add(machine1);
       list.add(machine2);
       list.add(machine3);
       list.add(machine4);
       list.add(machine5);
       list.add(machine6);
       for(Machine machine:list){
           machine.getForAvgPriceeachTupeTransport();
        }
    }
}
