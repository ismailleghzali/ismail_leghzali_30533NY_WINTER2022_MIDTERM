package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class UnitTestingMath {
    @Test
    public void testFatorial(){
        int currentResault = Factorial.factorialRecursion(5);
        int ExpectedResault =120;
        Assert.assertEquals(currentResault,ExpectedResault);
        System.out.println("test factorial passed ");

    }
    @Test
    public void testFatorial1(){
        int currentResault = Factorial.factorialIteration(5);
        int ExpectedResault =121;
        Assert.assertEquals(currentResault,ExpectedResault);
        System.out.println("test factorial 1  passed ");

    }


    @Test
    public void testFibonnaci(){
        long current = Fibonacci.fib(40);
        long Expected =102334155;
        Assert.assertEquals(current,Expected);
        System.out.println("test fibonnaci   passed ");

    }
    @Test
    public void testFibonnaci1(){
        long current = Fibonacci.fib(40);
        long Expected =121;
        Assert.assertEquals(current,Expected);
        System.out.println("test fibonnaci  1 passed ");

    }
    @Test
    public void testFinfLowest(){
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int current = FindLowestDifference.FindLowest(array1,array2);
        int  Expected =121;
        Assert.assertEquals(current,Expected);
        System.out.println("test find lowest   1passed ");

    }
    @Test
    public void testFinfLowest1(){
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int current = FindLowestDifference.FindLowest(array1,array2);
        int  Expected =1;
        Assert.assertEquals(current,Expected);
        System.out.println("test find lowest  1  1passed ");

    }
    @Test
    public void testFinfMissing(){
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int current = FindMissingNumber.findMissing(array);
        int  Expected =1;
        Assert.assertEquals(current,Expected);
        System.out.println("test find missing    passed ");

    }
    @Test
    public void testFinfMissing1(){
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int current = FindMissingNumber.findMissing(array);
        int  Expected =9;
        Assert.assertEquals(current,Expected);
        System.out.println("test find missing  1  passed ");

    }
    @Test
    public void testPrimeNumber(){
        ArrayList<Integer> Expected=new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        ArrayList<Integer> current = new ArrayList<Integer>();

        Assert.assertEquals(current,Expected);
        System.out.println("test prime number   passed ");

    }
    @Test
    public void testPrimeNumber1(){
        ArrayList<Integer>Expected=new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 30, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        ArrayList<Integer> current = new ArrayList<Integer>();

        Assert.assertEquals(current,Expected);
        System.out.println("test prime number 1   passed ");

    }

    @Test
    public void testFindLOwest(){
        int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        LowestNumber current= new LowestNumber();
        int expected = 45 ;
        Assert.assertEquals(current,expected);
        System.out.println("test find lowest passed ");
    }
    @Test
    public void testFindLOwest1(){
        int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        LowestNumber current= new LowestNumber();
        int expected = 5 ;
        Assert.assertEquals(current,expected);
        System.out.println("test find lowest1 passed ");
    }




}