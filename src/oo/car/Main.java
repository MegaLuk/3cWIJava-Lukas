package oo.car;
import java.util.Scanner;

public class Main {
    private int honkAmount;
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.fuelConsumption = 20;
        c1.serialNumber = "B144M";
        c1.fuelAmount = 50;
        c1.fulltank = 70;



        Car c2 = new Car();
        c2.brand = "VW";
        c2.fuelConsumption = 8;
        c2.serialNumber = "V1234W";
        c2.fuelAmount = 40;
/*
        for(int i=7; i>0; i--) {
            c1.drive();
            c1.turboboost();
        }
*/
/*       Scanner scanner = new Scanner(System.in);
        int honkAmount = scanner.nextInt();

        for (int i = honkAmount; i > 0; i--) {
            c1.honk();
        }
*/

        c1.getRemainingRange();
    }
}
