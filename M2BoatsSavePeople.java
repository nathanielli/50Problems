import java.util.*;
import java.io.*;

public class M2BoatsSavePeople {
    public static int boatsSavePeople(ArrayList<Integer> arr, int limit) {
        Collections.sort(arr);
        int ret = 0;
        while(arr.size() > 1) {
            ++ret;
            if(arr.get(0) + arr.get(arr.size()-1) <= limit) {
                arr.remove(0);
            }
            arr.remove(arr.size()-1);
        }
        return ret + arr.size();
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
        int result = boatsSavePeople(test2, test[0]);
        System.out.println(result);
    }

    public static <T> void main(String args[]) {
        ArrayList<int[]> tests = new ArrayList<>();
        int[] test1 = {3, 1, 2};
        tests.add(test1);
        int[] test2 = {5, 1, 2, 3, 4, 5};
        tests.add(test2);
        int[] test3 = {3, 2, 2, 2};
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

