class program54
{
    // SeQUENCE
    //Non static method 
    
    public static void main(String A[])
    {
        //method is static 
      // Iteration.Display();
      //Object creation bcz method is non static 
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
        System.out.println("jay ganesh....");
        System.out.println("jay ganesh....");
        System.out.println("jay ganesh....");
        System.out.println("jay ganesh....");
    }
}