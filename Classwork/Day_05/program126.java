//Day 5 23-10-2026
// Problems on "DIGITS"
//problem stmt: accept number from user and count the digit 

import java.util.Scanner;

class Digit
{
    public  int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;
        //Updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;  
            iNo = iNo/10;  
            iCount++; 
            //System.out.println(iDigit);    
        }
       return iCount;
        
    }
}
public class program126 
{
    public  static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
       Digit digit = new Digit();

       System.out.println("Enter Number : ");
       int iValue = scanner.nextInt();

       int iRet = digit.CountDigits(iValue); 
       System.out.println("Count of Digits is : "+iRet);
        
    }
    
}