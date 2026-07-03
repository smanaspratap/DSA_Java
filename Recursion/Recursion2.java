package Recursion;
//Print number till 5 using Recursion.
public class Recursion2 {
    static void print(int n){
        //BC
        if(n == 6){
            return;
        }
        //1 case khud
        System.out.println(n);
        //Rest rec
        print(n+1);

    }

    static void main(String[] args) {
        print(1);
    }
}
