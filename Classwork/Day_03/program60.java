import java.util.Scanner;

class program60
{
    
    public static void main(String A[])
    {   
        // Converting static to dynamic means taking count from user
        
        
        //to take input scanner from util package need to use  
        Scanner scanner = new Scanner(System.in); // to interact with console system.in 

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
        System.out.println("--------------");
        System.out.println("jay ganesh!!!");
        System.out.println("--------------");
       }
    }
}
