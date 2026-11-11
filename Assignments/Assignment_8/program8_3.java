/*
Function Name : Calculatefactorial
Description : factorial of given number
Input : 
Output : 
Author : Shweta
date : 11-11-2026
 */
import  java.util.Scanner;

class FactorialOfNumber
{
    public  static  int Calculatefactorial(int iNo)
    {
        int iCnt = 0, iAns = 1;

        // for(iCnt = 1; iCnt <= iNo; iCnt++)
        // {
        //     iAns = iCnt*iAns;
        // }
        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            iAns = iCnt*iAns;
        }
        return  iAns;
    }
}

public class program8_3 {
    public  static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number : ");
        iValue = scanner.nextInt();

        iRet = FactorialOfNumber.Calculatefactorial(iValue);

        System.out.println("Factorial of "+ iValue + " is : "+iRet);

    }
    
}
