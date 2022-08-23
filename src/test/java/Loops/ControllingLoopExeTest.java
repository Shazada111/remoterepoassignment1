package Loops;

import org.testng.annotations.Test;

public class ControllingLoopExeTest {

    @Test
    public void terminateLoopExe1() {
        int stopAt = 8;

        int num = 100;
        while (num >= 0) {
            System.out.println(num);
            if (num == stopAt) ;
            num--;


        }
    }//end


    @Test
    public void terminateLoopExe2() {

        int stopAt = 88;
        for (int num = 100; num >= 0; num--) {
            System.out.println(num);
            if (num == stopAt)
                break;
        }
    }

    @Test
    public void skippingLoopIternation() {

        int num = 0;
        while (num <= 10) {

            if (num == 4 || num == 7 || num == 9) {
                num++;
                continue;
            }

            System.out.println(num);

            num++;
        }

    }

    @Test
    public void skippingChallenge() {

        // if any number is divisible by 5
        // do not print that number

        int num = 1;

        while (num <= 1000) {

            boolean isDivisible = (num % 5 == 0);

            if (isDivisible) {
                System.out.println("skipping..");
                num++;
                continue;
            }

            System.out.println(num);
            num++;
        }
    }

    @Test
    public void skippingWithForLoop() {

        for (int i = 0; i <= 10; i++) {

            if (i == 4 || i == 7 || i == 9)
                continue;

            System.out.println(i);
        }
    }

}





