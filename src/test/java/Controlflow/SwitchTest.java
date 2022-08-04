package Controlflow;

import org.testng.annotations.Test;

public class SwitchTest {
    // code formatting :
    // mac:[command] + [option] +[shift] +[l];

    @Test
    public void demo() {
        int ratio = 110;

        switch (ratio) {
            case 40:
                System.out.println("this case is for value40");
                System.out.println("Generate some reports");
                break;

            case 50:
                System.out.println("this case is for value50");
                System.out.println("Generate some reports");
                break;

            case 70:
                System.out.println("this case is for value70");
                System.out.println("Generate some reports");
                break;
            default:
                System.out.println("this is a default");
                System.out.println("Generate some report");


        }

    }// end :: demo

    // end :: class

    @Test
    public void demo2() {
        // accepts:    int,char,String
        // won`t accept: double, boolean

        String role = "";
        switch (role) {
            case "admin":
                System.out.println("you have full access");
                System.out.println("you can mange everything!");
                break;
            case "system":
                System.out.println("you have system level access");
                System.out.println("you can only manage home / dir");
                break;
            case "guest":
                System.out.println("you have guest level access");
                System.out.println("you can only manage desktop /dir");
                break;
            default:
                System.out.println("you do not have any access");
                System.out.println("this incident will be logged");

        }
    }// end :: class


}