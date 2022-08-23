package Loops;

import org.testng.annotations.Test;

public class WhileLoopTest {

    public static void pause(int s) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            // Don nothing
        }
    }// end

    @Test
    public void whileloopDemo() {

        int number = 0;  // var
        while (number < 4) {        // while loop
            System.out.println(number);
            number++; // updater
            pause(10);
        }

    }//end

    @Test
    public void whileLoopCountingUp() {

        int counter = 4;
        int limit = 7;

        while (counter <= limit) {
            System.out.println("COUNTER VALUE" + counter);
            pause(6);
            counter++;
        }
    }
    //end :: class

    @Test
    public void countingDown() {
        //10,9,8, .... 1, 0
        // 10>=0 --> true
        // 5>=0 --> true
        // 0>=0 --> true
        // -1>= 0 --> false
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    @Test
    public void partsOfForLoop() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    //end
    @Test
    public void whileLoopCountingDown() {
        int counter = 10;
        //10,9,8,....3,2,1,0,
        System.out.println(counter >= 0);

        while (counter >= 0) {
            System.out.println("value:" + counter);
            pause(2);
            counter--;  //updater
        }


    }    //end

    @Test
    public void whileLoopUpdaterEX1() {
        // +=,-=,*=,/=,%=
        int counter = 0;
        while (counter <= 50) {
            System.out.println("value" + counter);
            counter += 10;
            pause(3);
        }
    }// end

    @Test
    public void whileloopUpdaterEx2(){

        int runner = 100;
        while (runner >= 0) ;
        {
            System.out.println(runner);
            pause(10);
            runner -= 20;

        }

    }
    @Test
    public void decisionsInLoopEXe(){

        int counter =0;
        while (counter <=100){

            System.out.println(counter);
         if (counter%2 ==0){
             System.out.println("even number");

         }
         else{
             System.out.println(counter);
         }
         counter++; // updater

        }
    } //end::
       @Test
      public void searchForNumber(){
         int targetId =20;
         //     hidden   //
         int dataId = 0;
                 while(dataId<=1000);{
                     if (dataId==targetId)
               System.out.println("searching for target id!");
                  if (dataId==targetId){
                      System.out.println("ID exist!");
                  }
                   dataId++;
           }
       }//end::
}


