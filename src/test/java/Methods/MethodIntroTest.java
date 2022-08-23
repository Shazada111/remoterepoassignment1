package Methods;

import org.testng.annotations.Test;
import ui.Automations;

public class MethodIntroTest {


    @Test
    public void exe_bloc() {

        generateRandomNumberPrintTwice();

        generateRandomNumberPrintTwice();

        generateRandomNumberPrintTwice();

        generateRandomNumberPrintTwice();

        Automations.openBrowser();
        MethodPartTest.generateRandomNUM(10);

    }
        //*1.  Isolate the repeated code.
        //*2.  prevents repeated code.
        //*3.  provide abstraction.
        //*4.  Update is made easy.
     void generateRandomNumberPrintTwice()
     {
        int num4 =(int)(Math.random()*100);  // 0-99
        System.out.println(num4);
        System.out.println(num4);


    }
}
