package Controlflow;

import org.testng.annotations.Test;

public class ifstatementTest {
    /*
    if (condition) {
       code here..
       }
     */

    @Test
    public void demo() {
        boolean isRaining = true;
        if (!isRaining) ;
        System.out.println("really?");
        System.out.println("let`s just stay home");
    } // end class demo.

    @Test
    public void Demo2() {
        int userAge = 117;
        int agelimit = 35;
        if (userAge > agelimit) {
            System.out.println("you can vote");
            System.out.println("click link to proceed");
        }
    } // end class demo2


  @Test
    public void demo3(){
        String userInput = "password";  // empty text
        String expected  = "password";

        boolean match = userInput.equals(expected);  // true,false
      System.out.println(match);

      if (match){
          System.out.println("password match");
          System.out.println("let the user process to home page");
      }
      else {
          System.out.println("password incorrect");
          System.out.println("Try again");
      }

    }
} // end class demo3
