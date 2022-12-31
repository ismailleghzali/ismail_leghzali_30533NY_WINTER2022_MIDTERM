package string.problems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // split the string by space
        String[] words = st.split(" ");


        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }

            else {
                wordCount.put(word, 1);
            }
        }


        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }


        int totalLength = 0;
        int numWords = words.length;
        for (String word : words) {
            totalLength += word.length();
        }
        double averageLength = (double) totalLength / numWords;

        System.out.println("Average length of words: " + averageLength);

    }

    public static ArrayList<String> duplicatedWord(String st) {
        return duplicatedWord(st);
    }
}