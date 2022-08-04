package variable;

import org.testng.annotations.Test;



public class VariableTest {

    private String password;

    @Test
    public void praciceOne (){
        String name ="John.miller";
        int age= 32;
        String username = "john.miller";
        String passwords = "Stringpass123!";
        boolean isOnline = true;
        int numOfFollowers =1230;
        int numberOfFollowings =245;
        double likescoreAve =13.4;
        //User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t"+ age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently Online:\t" + isOnline);
        System.out.println("Number of follower:\t" +numOfFollowers);
        System.out.println("Number of following:\t" +numberOfFollowings);
        System.out.println("like score average:\t" +likescoreAve);

        // simulation of state change.
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;
        numOfFollowers = 3230;
        numberOfFollowings =1245;
        likescoreAve =23.4;



    }


}
