import java.util.*;
import java.io.*;

public class E1MoveZeroes {
    public static int[] moveZeroes(int[] arr) {
        int[] ret = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length; ++i) {
            if(arr[i] != 0) {
                ret[j++] = arr[i];
            }
        }
        return ret;
    }

    public static void printTests(int[] test) {
        for(int i=0; i<test.length; ++i) {
            System.out.print(test[i]);
        }
        System.out.print(" -> ");
        int[] result = moveZeroes(test);
        for(int i=0; i<result.length; ++i) {
            System.out.print(result[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<int[]> tests = new ArrayList<>();
        int[] test1 = {0, 1, 2, 3, 4};
        tests.add(test1);
        int[] test2 = {0, 0, 0};
        tests.add(test2);
        int[] test3 = {1, 2, 3};
        tests.add(test3);
        int[] test4 = {1, 0, 2, 0, 3};
        tests.add(test4);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}
