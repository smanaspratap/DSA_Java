package Recursion.Easy;
//To print numbers 1 to N using recursion.
public class OnetoN {

    static void OnetoN(int n){

        //BC
        if(n == 0){
            return;
        }

        OnetoN(n-1);
        System.out.println(n);
    }
    static void main() {
        int n = 10;
        OnetoN(n);
    }
}
