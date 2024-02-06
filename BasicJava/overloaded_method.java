import java.util.Scanner;

public class overloaded_method
{
    // overloaded methods are method which share the same but but different parameters
    //(number of parameters will be different or the datatype of the parameter will be different)

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first furniture: ");
        String x = scan.nextLine();
        System.out.println("Enter second furniture: ");
        String y = scan.nextLine();
        System.out.println("Enter third furniture: ");
        String z = scan.nextLine();
        System.out.println("Enter first number: ");
        int i = scan.nextInt();
        System.out.println("Enter second number: ");
        int j = scan.nextInt();

        furniture(x, y);

        furniture(x, y, z);

        furniture(i, j);

        scan.close();
    }

    static void furniture(String a, String b)
    {
        System.out.println("This is first method");
        System.out.println("It includes "+a+" and "+b);
    }

    static void furniture(String a, String b, String c)
    {
        System.out.println("This is second method");
        System.out.println("It includes "+a+", "+b+" and "+c);
    }

    static void furniture(int a, int b)
    {
        System.out.println("This is third method");
        System.out.println(a+b);
    }
}
