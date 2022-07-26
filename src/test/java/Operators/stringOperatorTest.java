package Operators;



import org.testng.annotations.Test;

public class stringOperatorTest {

    
    // Symbol +
    //[string data] + [string data ] ---> [string data]
    
    @Test
    public void concatDemo() {

        String output = "Test score" + "90";
        System.out.println(output);

    }

    int testCount=120;


    String out1 = true +"120";



    @Test

    public void concatUsage(){

          String testsname="smoke";
          int totalnum=60;
          int passed=30;
          int skipped=10;
          int failed= 20;

          String output="Test executed: " + testsname + "\n"
                  +"Total testcases:"  +totalnum +"\n"
                  +"Test passed:"  +passed +"\n"
                  +"Total skipped:"  +skipped + "\n"
                  +"Total failed:"   +failed +"\n";


    }


}

