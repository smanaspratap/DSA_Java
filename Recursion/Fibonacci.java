package Recursion;
//Find the nth Fibonacci number using recursion!!
// -> 0,1,1,2,3,5,8...
public class Fibonacci {

    static int fib(int n) {
        //bc
        if (n < 2) {
            return n;
        }
        //recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
