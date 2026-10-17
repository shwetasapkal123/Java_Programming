class program56
{
    
    public static void main(String A[])
    {        
      Iteration iteration = new Iteration();
      iteration.Display();

    }

}
class Iteration
{
    //inbuilt iterable name class is there 
    //non static method
    public  void  Display()
    {
        //Just changed condition to 6
        int iCnt = 0;
       for(iCnt = 1; iCnt <= 6; iCnt++)
       {
        System.out.println("jay ganesh!!!");
       }
    }
}