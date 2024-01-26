import java.util.Random;

public class random
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int a = rand.nextInt(100);
        double b = rand.nextDouble();
        boolean c = rand.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}
