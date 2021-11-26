import java.util.Random;
import java.util.Scanner;

public class Wuerfel {


    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;

        Scanner scanner = new Scanner(System.in);


        for (int amountOfDraws = 6; amountOfDraws >= 1; amountOfDraws--) {

            System.out.println("noch " + amountOfDraws + " Würfel übrig");
            System.out.println("drücke 1 zum Würfeln");

            int würfeln = scanner.nextInt();

            if (würfeln == 1) {

                Random random = new Random();

                //player

                int anzahl_a = random.nextInt(5) + 1;
                System.out.println("Du hast eine " + anzahl_a + " gewürfelt");

                player1 = player1 + anzahl_a;
                System.out.println("gesamt player " + player1);

                System.out.println("");
                //Computer

                int anzahl_b = random.nextInt(5) + 1;
                System.out.println("Der Computer hat eine " + anzahl_b + " gewürfelt");

                player2 = player2 + anzahl_b;
                System.out.println("gesamt computer " + player2);

                System.out.println("");
            } else {
                System.out.println("!!!1!!!!");

            }


        }
        System.out.println("Player Ergebniss: " + player1);
        System.out.println("Computer Ergebniss: " + player2);
        System.out.println("");

        if (player1 < player2) {

            System.out.println("der Computer hat gwonnen!");
        } else {

            System.out.println("Du hast gewonnen!");

        }

    }
}