package Methods;

import org.testng.annotations.Test;

public class MethodTypesTest {
    //usage:
    @Test
    public void code_execution() {
        //using method
        // calling method
        // Designing and Crafting method
        printHelloTenTimes();

        //1. store the return data
        int var = getRandomNumber();
        System.out.println("Returned data:"+ var);

        //2. use the data in calculation
        int result = 10 *getRandomNumber();
        System.out.println("Result of calc:"+ result);

        //3. use this as an input to other method
        System.out.println( getRandomNumber());

        printHello(54);  // 54 <---argument.

        int ret = getRandomNumber(80);
        System.out.println("Result of [ret]:" +ret);
        System.out.println("Random number:"+getRandomNumber(80));

    }//end:


    // ...Type1...
    // *no inputs
    // no return data
    //
    public void printHelloTenTimes(){
        //i=0,1,2,3,4,5,6,7,8,9
        for(int i=1; i<=10; i++);
        System.out.println("Hello!");
    }
     // Type2
     // *no inputs
     //return data
     public int getRandomNumber(){
        int num =(int)(Math.random()*100);
        return num;
     }
     // Type3  //
     // asks input
    // no return data
    public void printHello(int count){
      for (int i= 0; i < count ; i++);
        System.out.println("Hello");
    }
    //Type4
    // asks return data value
    //asks input
    public int getRandomNumber(int limit){
        int number = (int)(Math.random() *limit);
        return number;
    }

}

