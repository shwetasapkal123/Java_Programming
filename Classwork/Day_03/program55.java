class program55
{
    //Iteration: for(fix iteration counter)
    // in every case counter is trated as Integer
    //  while, do while 
    
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
        //Displacement - loop displacement iCnt++
        //point 1= iCnt =1 , iCnt<= if yes then go to point 4 = sout(jay ganesh) then go to point 3 iCnt++
        // loop move in point 1 to point 2
        //point 2 iCnt <= 4
        //Run, Dry Run(orally on paper run is reverse engineering)
        //loop array travel krnar asel tr start from 0 otherwise start from 1

        //Using Iteration 
        // loop is static bcz count is fix and value is fix 
        int iCnt = 0;
       for(iCnt = 1; iCnt <= 4; iCnt++)
       {
        System.out.println("jay ganesh!!!");
       }
    }
}