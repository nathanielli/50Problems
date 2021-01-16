import java.util.*;
import java.io.*;

public class E3ValidMountain {
    public static boolean validMountain(ArrayList<Integer> arr) {
        if(arr.size() < 3) {
            return false;
        }
        for(int i=0; i<arr.size(); ++i) {
            if(helper(arr, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean helper(ArrayList<Integer> arr, int index) {
        for(int i=1; i<=index; ++i) {
            if(arr.get(i) <= arr.get(i-1)) {
                return false;
            }
        }
        for(int i=index+1; i<arr.size(); ++i) {
            if(arr.get(i) >= arr.get(i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void printTests(int[] test) {
        for(int i=0; i<test.length; ++i) {
            System.out.print(test[i] + " ");
        }
        System.out.print(" -> ");
        ArrayList<Integer> test2 = new ArrayList<>();
        for(int i=0; i<test.length; ++i) {
            test2.add(test[i]);
        }
        boolean result = validMountain(test2);
        System.out.println(result);
    }

    public static <T> void main(String args[]) {
        ArrayList<int[]> tests = new ArrayList<>();
        int[] test1 = {3, 1, 2};
        tests.add(test1);
        int[] test2 = {1, 2, 3, 4, 5, 3, 1};
        tests.add(test2);
        int[] test3 = {1, 3, 2, 2};
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

