package schoolcheck.coffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("1 -> einschalten");
        System.out.println("2 -> größe des Kaffees einzustellen");
        System.out.println("3 -> Stärke des Kaffees einzustellen");
        System.out.println("4 ->Wasser nachfüllen");
        System.out.println("5 -> Bohnen nachzfüllen");
        System.out.println("6 -> Kaffee herauslassen");
        System.out.println("7 -> ausschalten");




        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        switch(selection){
            case 1:

                System.out.println("Die Kaffee Maschine ist nun Betriebsbereit, bitte gib zuerst");
                break;
            case 2:
                System.out.println("geben sie eine Größe zwischen 40ml und 200ml an!");
                int CoffeSize = scanner.nextInt();

                    System.out.println(CoffeSize + "ml wurde gespeichert");
                    CoffeeMachine.setCoffeeSize(CoffeSize);

                break;
            case 3:
                System.out.println("geben sie die Stärke von 1-10 ein");
                int CoffeeStrength = scanner.nextInt();

                    System.out.println("Stärke " + CoffeStrength + " wurde gespeichert");
                    CoffeeMachine.setCoffeeStrenth(CoffeeStrength);

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;

        }
    }
}
