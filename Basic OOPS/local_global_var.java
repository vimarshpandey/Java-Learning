import java.util.Random;

class Dice
{
    Random random;
    int number = 0;
    
    Dice()
    {
        random = new Random();
        roll();
    }

    void roll()
    {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}

public class local_global_var
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();
    }
}
