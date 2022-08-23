package array;

import org.testng.annotations.Test;

import java.util.Arrays;

   public class ArrayIntroTest{

    @Test
    public void whatIsArray() {
        // 5 credit scores
        int score1 = 550;
        int score2 = 660;
        int score3 = 675;
        int score4 = 700;
        int score5 = 743;

        System.out.println(score1);

        // array: collection
        int[] creditScores = {
                550,  // 1st item
                660,  // 2nd item
                675,  // 3rd item
                700,  // 4th item
                743   // 5th item
        };

        System.out.println(creditScores);

        String arrayContent = Arrays.toString(creditScores);
        System.out.println(arrayContent);
        System.out.println(creditScores.length);
    }

        @Test
    public void arrayOfString() {
        String[] months = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug"
        };

        int size = months.length;
        System.out.println("Number of elements: " + size);
        System.out.println(Arrays.toString(months));

        System.out.println(months[2]);

        System.out.println(months[6]);

    }

    @Test
    public void arrayOfDoubles() {
        double[] balances = {
                3450.03,  // 1st  0
                6709.29,  // 2nd  1
                5400.18,  // 3rd  2
                500.45,   // 4th  3
                8500.45,  // 5th  4
                9765.09,  // 6th  5
                11345.67, // 7th  6
                13456.98, // 8th  7
                34576.90, // 9th  8
                23765.90  // 10th 9
        };

        System.out.println(balances.length);
        System.out.println("Content: " + Arrays.toString(balances));

        double thirdBalance = balances[2];
        System.out.println(thirdBalance);

        double forthBalance = balances[3];
        System.out.println(forthBalance);


        int lastIdx = balances.length - 1;
        System.out.println(lastIdx);
        System.out.println(balances[lastIdx]);
    }

}//end::class



