import java.util.Scanner;

class program58
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
    //inbuilt iterable name class is there 
    //non static method = helper method 
    public  void  Display(int iNo)
    {
        //Filter: check outside or before starting loop etc = Nprmal work/functionality will not change
        //Updater: 
        int iCnt = 0;
        //Input Filter
        if(iNo <= 0)
        {
            System.out.println("Invalid input ");
            return ; // function return value void. Method break here only 
        }
       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
        System.out.println("jay ganesh!!!");
       }
    }
}

//Test Case: positive 4 6 7
//2. Negative case -3 -5 No output