//Day 5 23-10-2026
// Problems on "DIGITS"
/* number system    range
    binary          0-1
    Decimal         0-9
    octal           0-7
    Hexadecimal      0-15

    Working on Decimal numbers.
*/
import java.util.Scanner;


public class program116 {
    public  static void main(String A[])
    {
        int iNo = 7592;

        System.out.println(iNo % 10);   //2
        iNo = iNo/10;   //759

        System.out.println(iNo % 10);   //759%10 = 9
        iNo = iNo/10;   //759/10 = 75

        System.out.println(iNo % 10);   //75%10 = 5
        iNo = iNo/10;   //75/10 = 7

        System.out.println(iNo % 10);   //7%10 = 7
        iNo = iNo/10;   //7/10 = 0
    }
    
}