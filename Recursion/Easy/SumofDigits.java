package Recursion.Easy;
//The same logic can be used to solve the question of doing Product of the digits.

// input : 1342 -> 1+3+4+2 should be the answer

public class SumofDigits {
    static int sumofdigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10)+sumofdigits(n/10);
        // 1342%10 = 2 + 1342/10 = 134
    }

    static void main(String[] args) {
        System.out.println(sumofdigits(1342));
    }
}
