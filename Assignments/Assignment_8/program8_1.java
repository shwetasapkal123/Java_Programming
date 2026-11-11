/*
Function Name :
Description : Accept number and print less, medium, large based on condition
Input : 75
Output : medium
Author : Shweta
date : 31-10-2026
 */

import java.util.Scanner;

class Display
{
    public static void DisplayNumber(int iNo)
    {
        if(iNo <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(iNo < 50)
        {
            System.out.println("Small");
        }
        else if(iNo >= 50 && iNo < 100)
        {
            System.out.println("medium");
        }
        else
        {
            System.out.println("large");
        }
    }
}
class program8_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        Display.DisplayNumber(iValue);
    }
}