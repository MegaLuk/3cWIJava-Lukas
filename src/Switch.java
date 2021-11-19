import com.sun.source.tree.IfTree;


import java.util.Random;

public class Switch {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(5)+5;
        System.out.println(randomNumber1);

        switch (randomNumber1) {
            case 10:
                System.out.println("ten");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 8:
                System.out.println("eight");
                break;

            default:
                System.out.println("irgend an anderer Müll");
                break;
        }

    }
}
