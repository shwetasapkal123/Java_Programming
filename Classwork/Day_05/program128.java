//Day 5 23-10-2026
// Problems on "DIGITS"
//problem stmt: Accept number from user and perform addition of digits 

import java.util.Scanner;

class Digit
{
    public  int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        //Updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;  
            iNo = iNo/10;  
               
        }
       return iSum;
        
    }
}
public class program128 
{
    public  static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
       Digit digit = new Digit();
        int iRet = 0;

       System.out.println("Enter Number : ");
       int iValue = scanner.nextInt();

       iRet = digit.SumDigits(iValue); 
       System.out.println("Summation of Digits is : "+iRet);
        
    }
    
}