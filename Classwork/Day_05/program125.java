//Day 5 23-10-2026
// Problems on "DIGITS"

import java.util.Scanner;
//Iteration
class Digit
{
    public  void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;  
            iNo = iNo/10;   
            System.out.println(iDigit);    
        }
       
        
    }
}
public class program125 
{
    public  static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
       Digit digit = new Digit();

       System.out.println("Enter Number : ");
       int iValue = scanner.nextInt();

       digit.DisplayDigits(iValue); 
        
    }
    
}