class furniture
{
    String material;
    String name;

    void price()
    {
        System.out.println("It is of high price");
    }
}

class chair extends furniture
{
    int legs = 4;

    chair(String n, String m)
    {
        this.name = n;
        this.material = m;
    }

    @Override
    void price()        // overridding the method which this class inherits from the parent class
    {
        System.out.println("It is of low price");
    }
}

class bed extends furniture
{
    int legs = 4;

    bed(String n)
    {
        this.name = n;
    }
}

public class inheritance1
{
    public static void main(String[] args)
    {
        chair c1 = new chair("Recliner", "Plastic");

        bed b1 = new bed("King");

        // furniture f1 = new furniture();

        System.out.println("The chair has "+c1.legs+" legs and the name is "+c1.name+" and it is made of "+c1.material);
        System.out.println("The bed has "+b1.legs+" legs and the name is "+b1.name+" and it is made of "+b1.material+"\n\n");

        c1.price();
        b1.price();
        // f1.price();
    }
}
