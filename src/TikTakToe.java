import java.util.Scanner;


public class TikTakToe {
    static int[][] feld = new int[3][3];

    public static void main(String[] args) {
        boolean gewinner = false;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (!gewinner) {
            System.out.println("   1  2  3");
            for (int row = 1; row < 4; row++) {
                System.out.print(row + " ");
                for (int collum = 1; collum < 4; collum++) {
                    switch (feld[row - 1][collum - 1]) {
                        case 0:
                            System.out.print("| |");
                            break;
                        case 1:
                            System.out.print("|x|");
                            break;
                        case 2:
                            System.out.print("|o|");
                            break;

                    }


                }

                System.out.println();


            }
            String selection = scanner.next();
        }
    }
}
