import java.util.Scanner;

public class nested_loops
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int rows = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a symbol: ");
        String symbol = scan.nextLine();

        for(int i = 0; i <= rows; i++)
        {
            System.out.println();
            for(int j = 0; j <=rows-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= i+1; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scan.close();
    }    
}
