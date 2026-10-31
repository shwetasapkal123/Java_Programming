/*
Function Name :
Description : Accept number and print that number of $ and * on screen
Input : 5
Output : $  *   $   *   $   *   $   *   $   *
Author : Shweta
date : 31-10-2026
 */
import  java.util.Scanner;

class Display
{
    public static void Displaypattern(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("$\t*\t");
        }
    }
}

public class program7_1
{
    public  static void main(String A[])
    {
        int iValue = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : \n");
        iValue = scanner.nextInt();

        Display.Displaypattern(iValue);

    }
    
}