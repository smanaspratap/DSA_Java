package Recursion.Easy;
// n= 5 -> 5+4+3+2+1
public class SumofNto1 {
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        //recursive case
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}