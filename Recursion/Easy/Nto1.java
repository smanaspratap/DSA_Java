package Recursion.Easy;

public class Nto1 {
    static void  nto1(int n)
    {
        //Base Case
        if(n==0){
            return;
        }
        //ek case khud se
        System.out.println(n);
        //baaki recursion ko dedo
        nto1(n-1);

    }

    static void main() {
        nto1(10);
    }



}
