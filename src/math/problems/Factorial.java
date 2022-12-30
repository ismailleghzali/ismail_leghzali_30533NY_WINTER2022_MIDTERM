package math.problems;
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 5;
        int result = factorialRecursion(num);
        System.out.println("Factorial of " + num + " using recursion: " + result);

        result = factorialIteration(num);
        System.out.println("Factorial of " + num + " using iteration: " + result);
    }

    public static int factorialRecursion(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursion(num - 1);
    }

    public static int factorialIteration(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

