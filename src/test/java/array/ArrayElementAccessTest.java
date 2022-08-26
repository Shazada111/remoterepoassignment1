package array;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class ArrayElementAccessTest {
    @Test
    public void changeElementTest() {
        int[] zipcodes = {
                3456,  // <-- 0
                20147, // <-- 1
                30175, // <-- 2
                3456,  // <-- 3
        };
        // Index 0,1,c2,3
        System.out.println(zipcodes[2]);

        // constructor syntax

        int[] zipCodes = new int[4];
        System.out.println(Arrays.toString(zipCodes));


        boolean[] rains = new boolean[5]; // rains -->[f] []f [f] [f] [f]
        System.out.println(Arrays.toString(rains));
    }

    @Test
    public void updateArrayContents() {
        char[] grades = {'A', 'B', 'B', 'F'};

        grades[1] = 'C';
        grades[3] = 'D';
    }

    @Test
    public void updateArrayContentsEx2() {
        char[] grades = new char[4];
        System.out.println("Before: " + Arrays.toString(grades));
        grades[0] = 'A';
        grades[1] = 'C';
        System.out.println("state:" + Arrays.toString(grades));
        grades[3] = 'C';
        grades[6] = 'S'; // IndexOutOfBoundException
        System.out.println("state:" + Arrays.toString(grades));
    }

    @Test
    public void visitingArrayElements() {
        //                   0      1    2      3     4
        String[] names = {"nijat, fawad,anna, wesley,any"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        for (int idx = 0; idx <= 4; idx++)
            System.out.println(names[idx]);

    }

    @Test
    public void arrayUsageDemo() {
        // collection of 10 random fake username
    String[] fakeUser = new String[10];
    for (int idx = 0; idx<=9; idx++) {
        Faker faker = new Faker();
        fakeUser[idx] = faker.name().username();
        System.out.println(Arrays.toString(fakeUser));
    }

    }
}



