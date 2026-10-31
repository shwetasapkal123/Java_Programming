/*
Function Name :
Description : Accept number and print numbers till that number
Input : 5
Output : 1  2   3   4   5
Author : Shweta
date : 31-10-2026
 */

import  java.util.Scanner;

class Display
{
    public void DisplayNumber(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
    }
}

public class program7_2 
{
    public  static  void main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number : \n");
        iValue = scanner.nextInt();

        Display display = new Display();
        display.DisplayNumber(iValue);

    }
    
}