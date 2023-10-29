package Patterns.Creational.Factory;

import Patterns.Creational.Factory.Librarian.AvgSubLibrarian;
import Patterns.Creational.Factory.Librarian.Librarian;
import Patterns.Creational.Factory.Librarian.VipSubLibrarian;

import java.util.Scanner;

public class Main {
    private static Librarian librarian;

    public static void main(String[] args) {
        start();

    }
    static void start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO OUR LIBRARY");
        System.out.println("-----------------------");
        System.out.println("Click enter to start");
        String startClick=sc.nextLine();
        System.out.println("What subscription do you want?");
        System.out.println("1.Average Subscription - 5$");
        System.out.println("2.Vip Subscription - 15$");

        System.out.print("Your decision: ");
        int subscription= sc.nextInt();
        switch (subscription){
            case 1 -> librarian=new AvgSubLibrarian();
            case 2 -> librarian=new VipSubLibrarian();
        }
        librarian.getTypeOfSub();
        System.out.print("You can get for rent books about:");
        librarian.getMaxPossibleRents();

    }


}
