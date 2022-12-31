package math.problems;

public class Fibonacci {
    /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
    public static int fib(int n ){
        if(n==0 || n == 1 )
            return n;
        return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        int n=40;

        // Print the first N numbers
        for (int i = 0; i < n; i++) {

            System.out.print(fib(i) + " ");
        }
        System.out.println(fib(n));

    }



}