import java.util.Scanner;

class Check{
    static boolean CheckingIfEven(int iNo1)
    {
        if ((iNo1%2) != 0)
        {
            return false;
        }
        return true;
    }
}

class CheckEven{

    public static void main(String a[])
    {
        int iValue1 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number to Check: ");
        iValue1 = scanner.nextInt();

        if ((Check.CheckingIfEven(iValue1)) == true)
        {
            System.out.println("Number is even Number");
        } else {
            System.out.println("Number is Odd");
        }

    }
    
}