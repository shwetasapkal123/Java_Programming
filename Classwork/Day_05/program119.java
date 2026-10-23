//Day 5 23-10-2026
// Problems on "DIGITS"

import java.util.Scanner;

//Sequence program
public class program119 {
    public  static void main(String A[])
    {
        int iNo = 175902;

        System.out.println("Number is : "+ iNo);    //175902

        System.out.println(iNo % 10);   //2
        iNo = iNo/10;   //17590
        System.out.println("Number is : "+ iNo);    //17590

        System.out.println(iNo % 10);   //17590%10 = 0
        iNo = iNo/10;   //17590/10 = 1759
        System.out.println("Number is : "+ iNo);    //1759

        System.out.println(iNo % 10);   //1759%10 = 9
        iNo = iNo/10;   //1759/10 = 175
        System.out.println("Number is : "+ iNo);    //175

        System.out.println(iNo % 10);   //175%10 = 5
        iNo = iNo/10;   //175/10 = 17
        System.out.println("Number is : "+ iNo);    //17

        System.out.println(iNo % 10);   //17%10 = 7
        iNo = iNo/10;   //17/10 = 1
        System.out.println("Number is : "+ iNo);    //1

        System.out.println(iNo % 10);   //1%10 = 1
        iNo = iNo/10;   //1/10 = 0
        System.out.println("Number is : "+ iNo);    //0
        
    }
    
}