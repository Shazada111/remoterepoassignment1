package Loops;

import org.testng.annotations.Test;
import ui.Automations;

public class ForLoopTest {
    @Test

    public void ForloopDemo() {

        for (int i = 1; i <= 3; i += 1) {
            // loop body
            System.out.println("value:" + i);
        }


        // end
    }

    @Test
    public void countUp() {

        for (int e = 0; e < 10; e++) {
            System.out.println("Electron No." + e);
        }
    }

    @Test
    public void ForloopCountingUp() {
        // index

        // 0 1 2 3 4 5 6  -----19, 20,21
        // while the value of [index] <= 21

    }

    @Test
    public void pause(int second) {
        try {
            Thread.sleep(1000 * second);

        } catch (InterruptedException ignore) {
            // DO NOTHING

        }
    }

    @Test
    public void practice() {
        // 2 3 4 6 8 10 .... 100
        for (int index = 2; index <= 10; index += 2) {
            if (index == 4 || index == 8) ;
            System.out.println("lucky number detected");

            System.out.println(index);
        }
    } // end :: class

       @Test
     public  void dataGeneration(){

           // i =1,2,3,4 .... 48,49,50
           for (int i =1; i<=50; i++){
        String fakerUser = Automations.data().name().username();
           System.out.println(fakerUser);



           }
       }
}


