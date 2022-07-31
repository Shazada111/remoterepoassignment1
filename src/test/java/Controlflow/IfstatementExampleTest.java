package Controlflow;

import org.testng.annotations.Test;

      public class IfstatementExampleTest {

    @Test
    public void syntaxSample() {

        //if (statement)

        if (false) System.out.println("hello,there!");
        else System.out.println("Alphaleaf!");

        System.out.println("students!");
    }

        @Test
                public void uatResultFilter() {
            int score = 80;

            // filtering
            //0,1,2....38,39,40
            if (score <= 40) {
                System.out.println("Generating RED Report");
                System.out.println("QA, BA, Dev investigate!");

            }
            // 41, 42,43 .......78,79,80
            if (score > 40 && score <= 80) {
                System.out.println("Generating YELLOW Report");
                System.out.println("QA members investigate!");
            }
            // 81,82 ..... 100
            if (score > 80) {
                System.out.println("Generating GREEN Report");
                System.out.println("Schedule for staging deployment");
            }
        }

                 @Test
                 public void nestIfStatement() {
                  // nest : code block inside another code block
                  //[180+] --> OKAY number ....180,198,[201,1000]
                  //[200+] -->OKAY  number, MAGIC number
                  int number = 184;
                  if (number >=180){
                      System.out.println("OKAY number");
                      if (number >=200){
                          System.out.println("MAGIC number");
                      }
                 }


             }
    }
