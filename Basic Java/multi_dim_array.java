import java.util.Scanner;

public class multi_dim_array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the number of columns: ");
        int cols = scan.nextInt();
        scan.nextLine();

        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.println("Enter the element: ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.println("The element number is: ");
                System.out.println(arr[i][j]);
            }
        }

        scan.close();
    }
}
