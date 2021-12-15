package schoolcheck;

import java.util.Scanner;
import java.util.Random;

public class RandomSentence {

    public static void main(String[] args) {
        String[] subjects = {"Er","Sie"};
        String[] verbs = {"geht","läuft","rennt","fährt"};
        String[] objects = {"nach Hause","zur Schule","ins Büro","zur Party"};

        boolean theEnd = true;

        System.out.println("Geben Sie eine Zahl ein");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int selection = scanner.nextInt();

        for(int i = 0; i <= selection -1; i++) {
            int random1 = random.nextInt (subjects.length) ;
            int random2 = random.nextInt (verbs.length) ;
            int random3 = random.nextInt(objects.length) ;
            System.out.println(subjects[random1] + " " + verbs[random2] + " " + objects[random3]);

        }

    }
}