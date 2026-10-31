/*
Function Name :DisplayNumber
Description : Accept number and print first 5 multiple of number
Input : 4
Output : 4  8   12  16  20
Author : Shweta
date : 31-10-2026
 */

import  java.util.Scanner;

public class  Display
{
    public  static  void DisplayMultipleOfNumber(int iNo)
    {
         int iCnt = 0, iMul = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= 5; iCnt++) 
        {        
            iMul = iCnt * iNo;
            System.out.print(iMul + "\t");
        }
    }
    
}
public class program7_5 {

    public  static  void  main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        Display.DisplayMultipleOfNumber(iValue);
    }
}