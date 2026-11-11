/*
Function Name : DisplayNumberWord
Description : Accept single digit number and print it into words
Input : 75
Output : medium
Author : Shweta
date : 31-10-2026
 */

import  java.util.Scanner;

class Display{
    public  static void DisplayNumberWord(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        switch (iNo) {
            case 0:
                 System.out.println("Zero");
                break;
            case 1:
                 System.out.println("one");
                break;
                case 2:
                 System.out.println("Two");
                break;
                case 3:
                 System.out.println("Three");
                break;
                case 4:
                 System.out.println("Four");
                break;
                case 5:
                 System.out.println("Five");
                break;
                case 6:
                 System.out.println("Six");
                break;
                case 7:
                 System.out.println("Seven");
                break;
                case 8:
                 System.out.println("Eight");
                break;
                case 9:
                 System.out.println("Nine");
                break;
            default:
                break;
        }
    }
}
public class program8_2 {
    public  static  void  main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number between 0 to 9 : ");
        iValue = scanner.nextInt();

        Display.DisplayNumberWord(iValue);
    }
}
