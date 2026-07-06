package Recursion.Easy;
//To reverse a number using recursion 12345 -> 54321
public class ReverseaNo {
    static int reverse(int n){
        //BC
        if(n==0){
            return 0;
        }

        int digit = n%10;
        int remaining = n/10;
        System.out.println(digit);
        return reverse(remaining);
    }

    static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
    }
}
