package string.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {

    @Test
    public void testAnagram(){
        String s1="cat";
        String s2="act";
        boolean ExpectedResault =true;
        boolean currentResault =string.problems.Anagram.currentResault(s1,s2);

        Assert.assertTrue(currentResault);
        System.out.println("test  anagram passed ");

    }
    @Test
    public void testAnagram1(){
        String s1="cat";
        String s2="act";

        boolean currentResault = string.problems.Anagram.currentResault(s1,s2);
        // boolean ExpectedResault =true;
        Assert.assertTrue(currentResault);
        System.out.println("test  anagram 1 passed ");

    }
    @Test
    public void testDtermineLargest(){
        String s="Human brain is a biological learning machine";
        Map<Integer,String> currentMap= string.problems.DetermineLargestWord.findTheLargestWord(s);
        Map<Integer,String>currentRes= string.problems.DetermineLargestWord.findTheLargestWord(currentMap.toString());
        Map<Integer,String>Expected=new HashMap<>();
        Expected.put(7,"biological");
        boolean key=currentRes.equals(Expected);
        Assert.assertTrue(key);
        System.out.println("test determine largest passed ");



    }
    @Test
    public void testDtermineLargest1(){
        String s="Human brain is a biological learning machine";
        Map<Integer,String>currentMap= string.problems.DetermineLargestWord.findTheLargestWord(s);
        Map<Integer,String>currentRes= string.problems.DetermineLargestWord.findTheLargestWord(currentMap.toString());
        Map<Integer,String>Expected=new HashMap<>();
        Expected.put(10,"biological");
        boolean key=currentRes.equals(Expected);
        Assert.assertTrue(key);
        System.out.println("test determine largest 1 passed ");


    }
    @Test
    public void testDuplicateWord(){
        String st = "Java is a programming Language . Java is also an Island of Indonesia. Java is widely used language";
        ArrayList<String> Current = string.problems.DuplicateWord.duplicatedWord(st);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("java","is","language"));
        Assert.assertTrue(Current.equals(expected));
        System.out.println("test duplicate word passed");


    }
    @Test
    public void testDuplicateWord1(){
        String st = "Java is a programming Language . Java is also an Island of Indonesia. Java is widely used language";
        ArrayList<String> Current = string.problems.DuplicateWord.duplicatedWord(st);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("island","is","language"));
        Assert.assertTrue(Current.equals(expected));
        System.out.println("test duplicate word passed");
    }
    @Test
    public void testPalidrome(){
        String s="ismail";
        Assert.assertTrue(string.problems.Palindrome.palindromeTest(s));
        System.out.println("test palidrome passed ");
    }
    @Test
    public void testPalidrome1(){
        String s="madam";
        Assert.assertTrue(string.problems.Palindrome.palindromeTest(s));
        System.out.println("test palidrome  1 passed ");
    }
    @Test
    public void testPermutation(){
        ArrayList<String>expected= new ArrayList<>(Arrays.asList("abc", "bac", "bca", "acb", "cab", "cba"));
        String[]ex = new String[expected.size()];
        for (int i=0;i<expected.size();i++){
            ex[i]=expected.get(i);
        }
        ArrayList<String> currrent= Permutation.getPermutation("abc");
        String[]cu = new String[currrent.size()];
        for (int i=0;i<currrent.size();i++){
            cu[i]=currrent.get(i);
        }
        Assert.assertArrayEquals(ex,cu);
        System.out.println("test passed ");

    }
    @Test
    public void testPermutation1(){
        ArrayList<String>expected= new ArrayList<>(Arrays.asList("abc", "acb", "bca", "acb", "cab", "cba"));
        String[]ex = new String[expected.size()];
        for (int i=0;i<expected.size();i++){
            ex[i]=expected.get(i);
        }
        ArrayList<String> currrent= Permutation.getPermutation("abc");
        String[]cu = new String[currrent.size()];
        for (int i=0;i<currrent.size();i++){
            cu[i]=currrent.get(i);
        }
        Assert.assertArrayEquals(ex,cu);
        System.out.println("test passed ");

    }

}
