//Day 5 23-10-2026
// Problems on "DIGITS"

import java.util.Scanner;
//Iteration
class Digit{
    public  void DisplayDigits()
    {
        int iNo = 175902;

        while(iNo != 0)
        {
            System.out.println("digit is : "+(iNo % 10));   
            iNo = iNo/10;   
            System.out.println("Number is : "+ iNo);    
        }
       
        
    }
}
public class program121 
{
    public  static void main(String A[])
    {
       Digit digit = new Digit();
       digit.DisplayDigits(); 
        
    }
    
}