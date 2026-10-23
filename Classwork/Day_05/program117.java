//Day 5 23-10-2026
// Problems on "DIGITS"

import java.util.Scanner;

//Sequence program
public class program117 {
    public  static void main(String A[])
    {
        int iNo = 7592;

        System.out.println("Number is : "+ iNo);    //7592

        System.out.println(iNo % 10);   //2
        iNo = iNo/10;   //759
        System.out.println("Number is : "+ iNo);    //759

        System.out.println(iNo % 10);   //759%10 = 9
        iNo = iNo/10;   //759/10 = 75
        System.out.println("Number is : "+ iNo);    //75

        System.out.println(iNo % 10);   //75%10 = 5
        iNo = iNo/10;   //75/10 = 7
        System.out.println("Number is : "+ iNo);    //7

        System.out.println(iNo % 10);   //7%10 = 7
        iNo = iNo/10;   //7/10 = 0
        System.out.println("Number is : "+ iNo);    //0
    }
    
}