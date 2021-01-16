import java.util.*;
import java.io.*;

public class M5LongestSubstring {
    public static int longestSubstring(String str) {
        int best = 0;
        for(int i=0; i< str.length(); ++i) {
            for(int j=i+1; j<str.length(); ++j) {
                String sub = str.substring(i, j+1);
                if(helper(sub) && sub.length() > best) {
                    best = sub.length();
                }
            }
        }
        return best;
    }
    public static boolean helper(String str) {
        for(int i=0; i<str.length(); ++i) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) != str.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void printTests(String test) {
        System.out.print(test + " -> ");
        int result = longestSubstring(test);
        System.out.println(result);
    }

    public static <T> void main(String args[]) {
        ArrayList<String> tests = new ArrayList<>();
        String test1 = "abcabcbb";
        tests.add(test1);
        String test2 = "asfasdf";
        tests.add(test2);
        String test3 = "adsjklsgd";
        tests.add(test3);

        for(int i=0; i<tests.size(); ++i) {
            printTests(tests.get(i));
        }
    }
}

