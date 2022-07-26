package Operators;

import org.testng.annotations.Test;

public class BsicOperatorTest {


    @Test
    public void demo() {
        //basic operator  +, -, /,* ,%
        //[num] +[num]--> [num]
        int age = 19;
        int num = 10;
        int result = age + num;
        System.out.println(result);  //29

    }

    @Test
    public void addingNumber() {

        // symbol +
        int Num = 10 + 20 + 90;
        System.out.println(Num);  // 120

        int n = 10;
        int m = 50;
        int ret = n + m + 20;
        System.out.println(ret);  // 80

        int x = 90;
        System.out.println(x + 8.900 + 'A');

    }

    @Test
    public void subtractingNumber() {
        // symbol   /
        int num = 10 - 20 - 90;
        System.out.println(num); // 120
        int n = 10;
        int m = 50;
        int ret = n - m - 20;
        System.out.println(ret); // 80

        int x = 10;
        System.out.println(x - 20.900 - 'A');
    }

     @Test
    public void dividingNumber() {
         // symbol   /
         // division --> double
         // Math.round();
         double num = 11.0 / 3;
         System.out.println(num);


     }
         @Test
         public void multiplyingNumbers() {
             // symbol *
             int n = 10;
             int m = 20;
             System.out.println(n * m); // 200
         }

        @Test
       public void modulus() {
            // Symbol  %
            int n = 13;
            int b = 5;
            int ret = n % b;
            System.out.println(ret);
        }

     }
