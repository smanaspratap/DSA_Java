package Recursion;
// We had to print the message of Hello World 5 times using recursion and that is how we do this.
/*
Simple Rule of Recursion that I know from past is
* Base Case: - Rukna kahan hai?
* Ek case khd: - solve one of the case yourself
* rest recursion ko dedo: - recursive call!!
*/
public class Recursion1 {
    static int count = 0;
    public static void message(){
        //Base case (Jahan rukna hota hai)
        if(count == 5){
            return;
        }
        //Ek case khud se
        System.out.println("Hello World!");
        count++;

        //rest rec ko dedo
        message();
    }

    static void main(String[] args) {
        message();
    }
}
