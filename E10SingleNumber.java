import java.util.*;
import java.io.*;

public class E10SingleNumber {
    public static int singleNumber(int[] arr) {
        for(int i=1; i<arr.length; i+=2) {
            if(arr[i-1] != arr[i]) {
                return arr[i-1];
            }
        }
        return arr[arr.length-1];
    }

    public static void printTests(int[] test) {
        for(int i=0; i<test.length; ++i) {
            System.out.print(test[i] + " ");
        }
        System.out.print(" -> ");
        int result = singleNumber(test);
        System.out.println(result);
    }

    public static <T> void main(String args[]) {
        ArrayList<int[]> tests = new ArrayList<>();
        int[] test1 = {3, 3, 2};
        tests.add(test1);
        int[] test2 = {3, 3, 2, 2, 4, 4, 5};
        tests.add(test2);
        int[] test3 = {1, 2, 2};
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

