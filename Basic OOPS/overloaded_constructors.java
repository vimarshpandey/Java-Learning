class Geaser
{
    String name;
    int capacity;
    double econumption;
    String indicator;

    Geaser(String n, int c, double ec)
    {
        this.name = n;
        this.capacity = c;
        this.econumption = ec;
    }

    Geaser(String n, int c, double ec, String i)
    {
        this.name = n;
        this.capacity = c;
        this.econumption = ec;
        this.indicator = i;
    }
}

public class overloaded_constructors
{
    public static void main(String[] args)
    {
        Geaser g1 = new Geaser("Havels", 25, 500.85);

        System.out.println("Here are the details of first geaser: ");
        System.out.println(g1.name);
        System.out.println(g1.capacity);
        System.out.println(g1.econumption);
        //System.out.println(g1.indicator);
    }
}