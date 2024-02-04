import java.util.Scanner;

public class method
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num_1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num_2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your name: ");
        String n = scan.nextLine();
        System.out.println("Enter your age: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your height: ");
        double h = scan.nextDouble();

        personal_details(n, a, h);

        sum(num_1, num_2);

        scan.close();
    }

    static void sum(int x, int y)
    {
        int z = x + y;
        System.out.println("The sum is "+z);
    }

    static void personal_details(String name, int age, double height)
    {
        System.out.println("Hello "+name+". You are "+age+" years old and your height is "+height+"cms.");
    }
}
