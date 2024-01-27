import java.util.Scanner;

public class simple_project
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side X: ");
        double x = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter the side Y: ");
        double y = scan.nextDouble();
        scan.nextLine();

        double z = Math.sqrt((x*x) + (y*y));

        System.out.println("The side Z is: "+z+" cms.");

        scan.close();
    }    
}
