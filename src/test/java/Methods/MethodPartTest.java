package Methods;

import org.testng.annotations.Test;

public class MethodPartTest {


    // Access modifies: public, private, protected.
    // integer return data type spec: int ,char, String
    //using these methods will result in a date value of this type.
    // Method name: generateRandomNUM.
    //Parameter: temp variable that holds user input.
    // method body: return --> return a data.
    static public int generateRandomNUM(int limit){
        int result =(int)(Math.random()*limit);
        return result;
    }

    public int compare(int input){
        if (input<=10) {
            return -1;
        }
        else if (input>10 && input<=80) {
            return 1;
        }
        else{
          return 0;
        }
    }

        @Test
        public void demo(){
        int var = generateRandomNUM(200);
            System.out.println(var);
        }
}// end:
