package programms;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] word = {"Feldkirch", "Rankweil", "Dornbirn"};
        Random random = new Random();
        int random1 = random.nextInt (word.length);
        String wordtoguess = word[random1];

        int[] number = new int[wordtoguess.length()];
        char[] singleletters = new char[wordtoguess.length()];
        singleletters = wordtoguess.toCharArray();

        for (int i = 0; i < wordtoguess.length(); i++) {


            if( number[i] == 1){
                System.out.print(singleletters[i]);
            } else
                System.out.print("*");

        }















    }
}