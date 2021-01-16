import java.util.*;
import java.io.*;

public class E8MissingNumber {
    public static int missingNumber(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int i = 0;
        while(arr.get(i) == i) {
            ++i;
        }
        return i;
    }

    public static void printTests(int[] test) {
        for(int i=0; i<test.length; ++i) {
            System.out.print(test[i] + " ");
        }
        System.out.print(" -> ");
        ArrayList<Integer> test2 = new ArrayList<>();
        for(int i=1; i<test.length; ++i) {
            test2.add(test[i]);
        }
        int result = missingNumber(test2);
        System.out.println(result);
    }

    public static <T> void main(String args[]) {
        ArrayList<int[]> tests = new ArrayList<>();
        int[] test1 = {3, 1, 4, 0};
        tests.add(test1);
        int[] test2 = {1, 2, 3, 4, 5, 7, 8, 0};
        tests.add(test2);
        int[] test3 = {1, 3, 2, 5, 0};
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

