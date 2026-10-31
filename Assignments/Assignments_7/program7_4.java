/*
Function Name :DisplayNumber
Description : Accept number and print all odd number till number
Input : 18
Output : 1  3   5   7   9   11  13    17
Author : Shweta
date : 31-10-2026
 */

import  java.util.Scanner;

public class  Display
{
    public  static  void DisplayOddNumber(int iNo)
    {
         int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++) 
        {        
            System.out.print(iCnt + "\t");
            iCnt = iCnt + 1;
        }
    }
    
}
public class program7_4 {

    public  static  void  main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        Display.DisplayOddNumber(iValue);
    }
}