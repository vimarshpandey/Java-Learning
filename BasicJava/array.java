import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of elements");
        int n = scan.nextInt();
        scan.nextLine();

        int[] salary = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" element: ");
            salary[i] = scan.nextInt();
            scan.nextLine();
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i < salary.length; i++)
        {
            System.out.println("The element number "+(i+1)+" is: ");
            System.out.println(salary[i]);
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(salary[i] == salary[j])
                {
                    System.out.println(salary[i]);
                }
                else
                {
                    
                }
            }
        }

        scan.close();
    }
}