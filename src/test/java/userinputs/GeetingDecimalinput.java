package userinputs;

import java.util.Scanner;

public class GeetingDecimalinput {

    public static void main(String[] args) {

        //1. Create a scanner
        Scanner scan = new Scanner(System.in);

        //2. prompt the user
        System .out.println("Enter the success ratio");
        double ratio = scan.nextDouble();
        ratio *= 10;

        //3. Echo back the input
        System.out.println("You are desired ratio" + ratio);

        //4. Close the scanner
        scan.close();;

    }
}
