import java.util.Scanner;

public class user_input
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scan.nextLine();

        System.out.println("What is your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("What is you favourite game: ");
        String game = scan.nextLine();

        System.out.println("Your name is "+name+" and your age is "+age+" years. You like to play "+game);

        scan.close();
    }
}
