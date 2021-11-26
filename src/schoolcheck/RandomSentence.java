package schoolcheck;

import java.util.Scanner;
import java.util.Random;

public class RandomSentence {

    public static void main(String[] args) {
        String[] teil1 = {"Er","Sie"};
        String[] teil2 = {"geht","läuft","rennt","fährt"};
        String[] teil3 = {"nach Hause","zur Schule","ins Büro","zur Party"};

        boolean ending = true;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int selection = scanner.nextInt();

        for(int i = 0; i <= selection -1; i++) {
            int random1 = random.nextInt(1) ;
            int random2 = random.nextInt(3) ;
            int random3 = random.nextInt(3) ;
            System.out.println(teil1[random1] + " " + teil2[random2] + " " + teil3[random3]);

        }

    }
}