package Controlflow;

import org.testng.annotations.Test;

import java.util.Scanner;

public class ConditinalassignTest {

    @Test
    public void Demo() {
        // Syntax  var = (condition)? value : value2;
        //
        // condition
        // -boolean data value: true,false
        // -relation operators: 10<1000
        // -boolean operators:  false&&true --> false
        // -function         :  isNYRainingNow() --> false
        // -boolean expression : (age <21 && isCitizen)  --->true or false
        int number = (true && false) ? 19 : 22;
        System.out.println(number);

    }

       public static void main(String[] args) {
        //1. create a scanner
        Scanner scan = new Scanner(System.in);

        //2. prompt the user
        System.out.println("please enter your age:");
        int userAge = scan.nextInt();

        // Decision
        String countcome = (userAge >= 16) ? "yes, eligible to vote" : "No, not eligible!";

        // output
        System.out.println(".........   output..........");
        System.out.println("Am I eligible to vote?> " + countcome);
    }


  {

    } {
           // 1. create a scanner
           Scanner scan = new Scanner(System.in);
           //2. process & process
           System.out.println("Enter a number:");
           int inputNum = scan.nextInt();

           //3. Decision
           int result = inputNum % 2; // {0,1}
           if (result == 0)  System.out.println("Even number!");
              else  System.out.println("Odd number");

           }

    }//end : main