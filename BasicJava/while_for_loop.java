import java.util.Scanner;

public class while_for_loop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name = "";

        while(name.isBlank())
        {
            System.out.println("Enter your name: ");
            name = scan.nextLine();
        }

        System.out.println("Your name is "+name);

        System.out.println("Your a number: ");
        int num = scan.nextInt();
        scan.nextLine();

        for(int i = 1; i<=10; i++)
        {
            System.out.println(num+" X "+i+" = "+num*i);
        }

        scan.close();
    }
}
