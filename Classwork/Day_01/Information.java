import java.util.Scanner;

class Information {


    public static void main(String a[])
    {
        String Firstname, lastName;
        int age =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        Firstname = scanner.nextLine();

        //System.out.println("Enter your last name: ");
        //lastName = scanner.nextLine();

        System.out.println("What is your age? ");
        age = scanner.nextInt();

        System.out.println("Your details are below: \n name : "+Firstname + "\n age: "+age);

    }
    
}
