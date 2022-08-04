package userinputs;

import java.util.Scanner;

public class GeetingTextinputs {

    public static void main(String[] args) {

        //1. Create a scanner

        Scanner scan = new Scanner(System.in);

        //2. user prompt
        System.out.println("Enter a text name");
         String userInput = scan. nextLine();

         //3. Echo
        System.out.println("useR Input: "+ userInput.toUpperCase());

        //4.Close  the scanner

        scan.close();


    }
}
