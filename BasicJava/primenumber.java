public class primenumber
{
    static int a = 0;
    public static void main(String[] args)
    {
        int i = 2;

        while(a < 15)
        {
            prime(i);
            i++;
        }
    }
    
    static void prime(int num)
    {
        int n = 0;

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                n++;
            }
        }

        if(n == 0)
        {
            System.out.println(num+" is a prime number");
            a++;
        }
    }
}
