package string.problems;
import java.util.ArrayList;
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        String s = "ABC";
        ArrayList<String> permutations = getPermutations(s);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static ArrayList<String> getPermutations(String s) {
        ArrayList<String> permutations = new ArrayList<>();
        if (s.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = s.charAt(0);
        String remainder = s.substring(1);
        ArrayList<String> words = getPermutations(remainder);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                permutations.add(insertCharAt(word, first, i));
            }
        }
        return permutations;
    }

    public static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }
}