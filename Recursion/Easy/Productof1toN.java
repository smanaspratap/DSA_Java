package Recursion.Easy;
// n= 5 -> 5*4*3*2*1
public class Productof1toN {
    static int product(int n){
        if (n == 1){
            return 1;
        }
        //recursive case
        return n*product(n-1);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(product(n));
    }
}
