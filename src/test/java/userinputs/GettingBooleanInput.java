package userinputs;

import java.util.Scanner;

public class GettingBooleanInput {

    public static void main(String[] args) {
        //1. Create a scanner
        Scanner scan = new Scanner(System.in);

        //2. Prompt the user
        System.out.println("Would you like to generate report?(true/false");
        boolean generateReport = scan.nextBoolean();

        //3.Make a decision
        if(generateReport) System.out.println("sure will generate for you");
        else       System.out.println("ok, no report them");

        //4. close the scanner
        scan.close();
    }
}
