//Day 5 23-10-2026
// Problems on "DIGITS"
//problem stmt: accept number from user and count the digit 

import java.util.Scanner;

class Digit
{
    public  int CountDigits(int iNo)
    {
        int iCount = 0;
        //Updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {  
            iNo = iNo/10;  
            iCount++;     
        }
       return iCount;
        
    }
}
public class program127 
{
    public  static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
       Digit digit = new Digit();
        int iRet = 0;

       System.out.println("Enter Number : ");
       int iValue = scanner.nextInt();

       iRet = digit.CountDigits(iValue); 
       System.out.println("Count of Digits is : "+iRet);
        
    }
    
}