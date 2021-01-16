import java.util.*;
import java.io.*;

public class M6SortedFirstLast {
    public static int[] sortedFirstLast(int[] arr, int target) {
        String temp = "";
        for(int i=0; i<arr.length; ++i) {
            temp = temp + arr[i];
        }
        int[] ret = new int[2];
        ret[0] = temp.indexOf(target + '0');
        ret[1] = temp.lastIndexOf(target + '0');
        return ret;
    }

    public static void printTests(int[] test) {
        for(int i=0; i<test.length; ++i) {
            System.out.print(test[i] + " ");
        }
        System.out.print(" -> ");
        int[] test2 = new int[test.length-1];
        for(int i=0; i<test.length-1; ++i) {
            test2[i] = test[i+1];
        }
        int[] result = sortedFirstLast(test2, test[0]);
        System.out.println(result[0] + " " + result[1]);
    }

    public static <T> void main(String args[]) {
        ArrayList<int[]> tests = new ArrayList<>();
        int[] test1 = {3, 1, 2};
        tests.add(test1);
        int[] test2 = {3, 2, 3, 3, 3, 3, 5};
        tests.add(test2);
        int[] test3 = {1, 1, 2, 2};
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

