package Operators;

import org.testng.annotations.Test;

import javax.swing.plaf.BorderUIResource;

public class LogicalOperatorTest {

    @Test
    public void andDemo() {
        // symbol   &&
        // boolean _ data &&    boolean _data --> boolean _data
        // AND is greedy , only returns true if both operand is true
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        boolean isRainning = true;
        boolean iswindy =true;
        boolean stayinside = isRainning && iswindy;
        System.out.println("user should stay inside?:); "+ stayinside);


    }

    @Test
    public void orDemo() {
        // symbol ||
        // boolean_data   || boolean_data --> boolean_data
        // OR is generous
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }

    @Test
    public void notDemo() {
        // symbol  !
        //  ! (boolean _data) --> boolean _data
        //NOT flips the boolean
        System.out.println(!false);
        System.out.println(!true);
    }

    boolean isRainning = false;
    boolean iswindy = false;
    boolean stayinside = isRainning || iswindy;
}
