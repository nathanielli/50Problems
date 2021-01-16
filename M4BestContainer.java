import java.util.*;
import java.io.*;

public class M4BestContainer {
    public static int bestContainer(int[] arr) {
        int best = 0;
        for(int i=0; i< arr.length; ++i) {
            for(int j=i+1; j<arr.length; ++j) {
                int val = (j - i) * Math.min(arr[i], arr[j]);
                if(val > best) {
                    best = val;
                }
            }
        }
        return best;
    }

    public static void printTests(int[] test) {
        for(int i=0; i<test.length; ++i) {
            System.out.print(test[i] + " ");
        }
        System.out.print(" -> ");
        int result = bestContainer(test);
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

