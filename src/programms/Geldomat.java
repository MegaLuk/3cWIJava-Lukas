package programms;

import java.util.Random;
import java.util.Scanner;

public class Geldomat {


    public static void main(String[] args) {


        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        Scanner scanner = new Scanner(System.in);

        boolean fertig = true;
        int balance = 0;


        while (fertig) {
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Wie viel möchten sie einzahlen?");
                    int einzahlen = scanner.nextInt();
                    System.out.println("Sie haben "+ einzahlen + "€ eingezahlt");
                    balance = balance + einzahlen;
                    break;

                case 2:


                    System.out.println("Wie viel möchten sie abheben");
                    int abheben = scanner.nextInt();

                    if (balance - abheben >= 0) {

                        balance = balance - abheben;
                        System.out.println("Sie haben " + abheben + "€ abgehoben");
                    } else {
                        System.out.println("nix so viel geld da");
                    }

                    break;


                case 3:
                    System.out.println("Ihr Kontostand beträgt " + balance + "€");
                    break;

                case 4:
                    fertig = false;
                    break;



            }

        }
    }
}