package Operators;

import org.testng.annotations.Test;

public class TypeConversionTest {

    private int grade;

    @Test
    public void imlicitTypeConversionDemo() {
        double count = 0.0; // decimal number
        int num = 890; // whole number

        // double <-- int  ok  impkicit type conversion
        count = num;
        System.out.println((count));

        double pi = 3.145;
        int ans = 0;
        // int <- double
        //ans = pi;    // NOT-OK

    }

    @Test
    public void inmplicitTypeConversionEx1() {
        char grade = 'C';
        System.out.println(grade);

        //s[int] <- v(char)
        int ans = 67;
        System.out.println(grade);

        // related Data Type
        // double,int,char --->  Numberical Data Type
    }

    @Test
    public void imlicitTypeConversionEx2() {
        //String var = true;
        // String var = 89.02;
        //String var ='C';
        //boolean var = 0;
        // boolean var = "test"
    }

        @Test
        public void explicitTypeConversionDemo() {
            //(int) double ->int
            int ans = (int) 19.89;
            System.out.println(ans);
            //(char)int -> char
            char grade = (char) 67000;
            System.out.println(grade);

            // double ->char
            char symbol = (char) 198.87;
            System.out.println(symbol);

            //not allowed
            //String var = (String)90;
            //String var =(String)true;
            //String var =(String)'C';
            //boolean var =(boolean)0;
            //noolean var=(boolean)"false";
        }

        @Test

        public void explicitTypeCastingUsage(){
          //generating random number
          // math.random()
          double ans = Math.random();  // 0.00000 ~ 0.999999999
          System.out.println(ans);

          ans*= 100;

          System.out.print(ans);

          int rand = (int)ans; // explicit type casting

          System.out.print(rand);

          // short way to write this
            System.out.println();
            int myRandom = (int) (Math.random()*100);  // 0-99
            System.out.println(myRandom);
        }
    }

