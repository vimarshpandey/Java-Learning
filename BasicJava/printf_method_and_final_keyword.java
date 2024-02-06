public class printf_method_and_final_keyword
{
    public static void main(String[] args)
    {
        // printf method

        System.out.printf("The integer is %d\n",5000);
        System.out.printf("The float / double is %,.3f\n",500000.123456789);
        System.out.printf("The string is %20s\n","Vimarsh");
        System.out.printf("The char is %c\n",'V');
        System.out.printf("The boolean is %b\n",false);

        // final keyword

        int a = 10;

        a = 20;

        final int B = 50;

        //B = 100;

        System.out.println("Value of a: "+a);
        System.out.println("Value of B: "+B);
    }
}
