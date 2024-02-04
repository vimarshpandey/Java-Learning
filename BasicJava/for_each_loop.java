import java.util.Scanner;

public class for_each_loop 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of friends: ");
        int num = scan.nextInt();
        scan.nextLine();

        String[] friends = new String[num];

        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter the name of friend number "+(i+1));
            friends[i] = scan.nextLine();
        }

        for(String j : friends)
        {
            System.out.println(j);
        }

        scan.close();
    }
}
