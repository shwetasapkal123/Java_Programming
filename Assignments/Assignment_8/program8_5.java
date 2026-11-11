 /*
Function Name : Calculatefactorial
Description : Accept number from user and display its table in reverse order.
Input : 
Output : 
Author : Shweta
date : 11-11-2026
 */

import java.util.Scanner;

class Display
{
    public  static void DisplayTableInReverse(int iNo)
    {
        int iCnt = 0, iAns = 0;
        System.out.println("table of "+iNo + " is : ");
        for(iCnt = 10; iCnt >= 1; iCnt--)
        {
            iAns = iCnt * iNo;
            System.out.println(iAns);
        }
    }
}

public class program8_5 {
    public  static  void main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        Display.DisplayTableInReverse(iValue);

    }
}
 
