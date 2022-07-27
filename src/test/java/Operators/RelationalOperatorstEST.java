package Operators;

import org.testng.annotations.Test;

public class RelationalOperatorstEST {

    @Test
    public void greaterThan() {
        // symbol >  greater than
        // n > m -->{ture,false}
        boolean ans = 10 > 5;
        System.out.println(ans);

        ans = 10 > 52;
        System.out.println(ans);
    }

    @Test
    public void greaterThanEqualTo() {
        // symbol >=  greater than or equal to
        // n>m -->  {true,false}
        boolean ans = 10 >= 9;
        System.out.println(ans);

        ans = 10 >= 10;

        System.out.println(ans);

        ans = 10 >= 26;
        System.out.println(ans);
    }
    @Test
    public void lessThan() {
        // symbol  < less than
        // n < m --> {true,false}
        boolean ans = 5 < 10;
        System.out.println(ans);
        ans = 5600 < 10;
        System.out.println(ans);
        ans = 98 < 98;
        System.out.println(ans);
    }

       @Test
       public void lessThanOrEqualTo(){
          // symbol <= less than equal to
          // n <= m ---> {true,false}
          boolean ans = 5<=10;
           System.out.println(ans);
           ans = 5<=5;
           System.out.println(ans);
           ans = 5<=-256;
           System.out.println(ans);

        }

        @Test
       public void equalTo() {
            // symbol == equal to
            // n==m{true,false}
            boolean ans = 53 == 53;
            System.out.println(ans);
            ans = 53 == 90;
            System.out.println(ans);
        }

         @Test
         public void notequalto() {
             // symbol ! = not equal to
             // n ! m-->{true,false}

             boolean ans = 1 != 7;
             System.out.println(ans);
             ans = 1 != 1;
             System.out.println(ans);
         }

             @Test
             public void flowOfExecution(){
               int age = 65;
                 System.out.println("line1");
                 System.out.println("line2");
                 System.out.println("line3");
                 System.out.println("line4");
                 System.out.println("line5");
                 System.out.println("line6");




            }

        }
