/*
Function Name :DisplayNumber
Description : Accept number and print its numbers line
Input : 5
Output : -5 -4 -3 -2 -1 0 1  2   3   4   5
Author : Shweta
date : 31-10-2026
 */

import  java.util.Scanner;

public class  Display
{
    public  static  void DisplayNumber(int iNo)
    {
         int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = -iNo; iCnt <= iNo; iCnt++) //icnt = -4   -4<= 4  icnt = -3
        {
            System.out.print(iCnt + "\t");
        }
    }
    
}
public class program7_3 {

    public  static  void  main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        Display.DisplayNumber(iValue);
    }
}