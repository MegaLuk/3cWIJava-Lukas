package programms;

import com.sun.source.tree.IfTree;

import java.util.Random;

    public class While {
        public static void main(String[] args) {

            Random random = new Random();
            var i = 0;

            boolean finished = false;

            while  (!finished) {

                int randomNumber1 = random.nextInt(10) + 20;
                System.out.println(randomNumber1);

                i = i + randomNumber1;

                if (randomNumber1 == 25 || randomNumber1 == 15){
                    finished = true;
                }
            }

            System.out.println(i);



        }
    }
