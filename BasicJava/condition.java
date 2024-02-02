import java.util.Scanner;

public class condition
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();

        if(age > 0 && age <18)
        {
            System.out.println("You are a minor");
        }

        else if(age == 18)
        {
            System.out.println("You just become an adult");
        }

        else if(age > 18 && age <120)
        {
            System.out.println("You are adult");
        }

        else
        {
            System.out.println("Please enter a valid age");
        }

        scan.close();
    }
}
