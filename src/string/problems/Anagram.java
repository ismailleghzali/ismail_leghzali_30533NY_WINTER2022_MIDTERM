package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String s1 = "CAT";
        String s2 = "ACT";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
        } else {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
            }
        }
    }
}