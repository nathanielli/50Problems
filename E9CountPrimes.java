import java.util.*;
import java.io.*;

public class E9CountPrimes {
    public static int countPrimes(int num) {
        boolean[] rec = new boolean[num + 1];
        if(num < 2) {
            return 0;
        } else {
            for(int i=2; i<num/2+1; ++i){
                for(int j=i*2; j<num+1; j+=i) {
                    rec[j] = true;
                }
            }
        }
        int count = 0;
        for(int i=0; i<num+1; ++i) {
            if(!rec[i]) {
                ++count;
            }
        }
        return count;
    }

    public static void printTests(int test) {
        System.out.print(test + " -> ");
        int result = countPrimes(test);
        System.out.println(result);
    }

    public static <T> void main(String args[]) {
        ArrayList<Integer> tests = new ArrayList<>();
        int test1 = 23;
        tests.add(test1);
        int test2 = 29;
        tests.add(test2);
        int test3 = 21;
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

