package Loops;

import org.testng.annotations.Test;

public class DoWhileLoop {
    @Test
    public void DoWhileDemo(){

        int number =0;
        do{
            System.out.println(number);
            number++;
         }while(number<=90);
    }
}
