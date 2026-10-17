import java.util.Scanner;

class program61
{
    
    public static void main(String A[])
    {   
        Scanner scanner = new Scanner(System.in); 

        int iValue = 0;

      Iteration iteration = new Iteration();
      System.out.println("Enter the frequency: ");
      iValue = scanner.nextInt();

      iteration.Display(iValue);

    }

}
class Iteration
{
    public  void  Display(int iNo)
    {
        int iCnt =0;
        //loop 
       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
        //sequence
        System.out.println("--------------"); //static
        System.out.println(iCnt); //dynamic
        System.out.println("--------------");
       }
    }
}
