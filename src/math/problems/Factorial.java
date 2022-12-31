package math.problems;

public class Factorial {


    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    public static int fact(int n ){
        if (n==1)
            return n;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int res=fact(5);
        System.out.println(res);
    }
}